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
	private JButton[][] squares = new JButton[gridSize][gridSize];
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
	
	public static void main (String[] args){
		Home h = new Home();
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
		
		MasterShip ms = new MasterShip();
		h.squares[x][y].setText(ms.getType());
		
		
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


