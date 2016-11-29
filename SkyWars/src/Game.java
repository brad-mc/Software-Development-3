import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Game {
	static ArrayList<Point> moves = new ArrayList<Point>();
	public static int  x = 0;
	public static int y = 0;
	public static MasterShip ms = new MasterShip();
	
	
	public static void main (String[] args){
		
	    //Creates random number generator 
		Random rand = new Random();
		
		boolean same = true;
		//Loop to spawn Master Ship cannot be spawned at 00
		while(same ==true){
			x = rand.nextInt(4);
			y = rand.nextInt(4);
			
			if(x ==0 & y ==0){
				same = true;
			}
			else{
				same = false;
				break;
			}
		}
		
		//Sets the coordinates of the master ship
		ms.setX(x);
		ms.setY(y);
		//Sets the default mode of the master ship
		ms.setMode("Defensive");
		//Creates a new instance of the GUI
		Home h = new Home(ms);
		//Moves the Master Ship to spawn position
		h.squares[x][y].setText(ms.getType());
		
		
		
		
	}

}
