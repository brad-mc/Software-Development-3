import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame {
	
	ShipFactory theFactory;
	static ArrayList<Point> moves = new ArrayList<Point>();
	public static int  x = 0;
	public static int y = 0;
	
	public static final int gridSize = 4;
	public JButton[][] squares = new JButton[gridSize][gridSize];
	public Home(){
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(gridSize,gridSize));
		
		for (int i = 0; i <gridSize; i++){
			for(int j = 0; j < gridSize; j++){
				squares[i][j] = new JButton();
				cp.add(squares[i][j]);
				
			}
		}
		
		cp.setPreferredSize(new Dimension (100,100));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Handle window closing
	      setTitle("Sky Wars");
	      setVisible(true);
	      setBounds(100, 100, 450, 300);
	}
	



	public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("myButton"))
        {
        	setTheFactory(new ShipFactory());
        	Random rand = new Random();

        	int  n = rand.nextInt(3) + 1;
        	
        	Ship ship;
			ship = this.theFactory.createShip(n);
			squares[0][0].setText(ship.getType());
            
            
        }
    }
	
	public void setTheFactory(ShipFactory theFactory) {
		this.theFactory = theFactory;
	}
	
	private class MoveShip implements Command{
		private ArrayList<JLabel> previousState = new ArrayList<JLabel>();
		private boolean previousTurnState;
		private ArrayList<JLabel> nextState = new ArrayList<JLabel>();
		private boolean nextTurnState;
		
		private MoveShip(){
			
			//previousState = lab;
			
		}
		
		public void execute(){}
		public void undo(){}
	}
	
	class Move extends TimerTask{
		public void run(){
			
		}
	}

}


