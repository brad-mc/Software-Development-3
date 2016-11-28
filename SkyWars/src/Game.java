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
		
		//h.squares[0][0].setText("Hey");
		//JOptionPane.showMessageDialog(null, "Hi", "InfoBox: " + "test", JOptionPane.INFORMATION_MESSAGE);
	   // h.squares[0][0].setText("Bye");
		Random rand = new Random();
		
		
		boolean same = true;
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
		
		//MasterShip ms = new MasterShip();
		ms.setX(x);
		ms.setY(y);
		ms.setMode("Defensive");
		Home h = new Home(ms);
		h.squares[x][y].setText(ms.getType());
		
		/*
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask(){
			@Override
		    public void run() {
				moves = NeighbourNodes.PossibleMoves(x, y);
				int move;
				move = rand.nextInt(moves.size());
				h.squares[x][y].setText("");
				x = ((int)moves.get(move).getX());
				y = ((int)moves.get(move).getY());
				h.squares[x][y].setText(ms.getType());
			}
		},1000,500);
		moves = NeighbourNodes.PossibleMoves(x, y);
		/*
		int move;
		move = rand.nextInt(moves.size() -1);
		x = ((int)moves.get(move).getX());
		y = ((int)moves.get(move).getY());
		h.squares[x][y].setText(ms.getType());
		*/
		
		
	}

}
