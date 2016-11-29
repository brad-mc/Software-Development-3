import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Audio implements LineListener { 
	//Variable used to work out if sound has finished playing
	boolean playCompleted;
	
	public void play(String audioFilePath) {
        
		//Declares file variable with path to audio file
		File audioFile = new File(audioFilePath);
        
		//Starts a thread to play the sound allowing the game to continue
        Thread t = new Thread(new Runnable() {
	         public void run()
	         {
	        	 try {
 
        try {
        	
        	//Declares an input stream
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            //Declares format
            AudioFormat format = audioStream.getFormat();
            // Decalres data line giving audio format info
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            
            //Declares a clip 
            Clip audioClip = (Clip) AudioSystem.getLine(info);
 
           
            //Opens audio stream
            audioClip.open(audioStream);
             //Starts audio clip
            audioClip.start();
             //pauses to wait for playback to complete
            while (!playCompleted) {
                
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
             // Closes the audio clip 
            audioClip.close();
             //Catches errors
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }
	        	 
	         } catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
 	         }
 	});
 	 //Starts the thread
        t.start();
         
    }
	
	@Override
    public void update(LineEvent event) {
        LineEvent.Type type = event.getType();
         
        if (type == LineEvent.Type.START) {
            System.out.println("Playback started.");
             
        } else if (type == LineEvent.Type.STOP) {
            playCompleted = true;
            System.out.println("Playback completed.");
        }
 
    }

}
