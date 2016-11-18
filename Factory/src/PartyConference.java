import java.util.ArrayList;
import java.util.Random;


public class PartyConference {
	
	public static void main (String[] args){
		PolicyImplementation PI = new PolicyImplementation();
		
		ArrayList<String> speaker = new ArrayList<String>();
		
		speaker.add("Health");
		speaker.add("Defence");
		speaker.add("Transport");
		speaker.add("Education");
		
		Random r = new Random();
		int Low = 0;
		int High = 4;
		int result = r.nextInt(High - Low) + Low;
		
		
		
		
		
		PI.implementPolicy(speaker.get(result));
	}

}
