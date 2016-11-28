import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame implements ActionListener {
	
	ShipFactory theFactory;
	int count = 0;
	static Point move = new Point();
	private CommandManager commandManager;
	//public static int  x = 0;
	//public static int y = 0;
	public JButton btnMove,btnUndo,btnOffensive,btnDefensive;
	public static final int gridSize = 4;
	public JButton[][] squares = new JButton[gridSize][gridSize];
	Random rand = new Random();
	
	public Home(MasterShip ms){
		
		commandManager = new CommandManager();
		 JPanel jsp1 = new JPanel();
	     JPanel jsp2 = new JPanel();
	     JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, 
	                true, jsp1, jsp2);
	     splitPane.setOneTouchExpandable(true);
	        getContentPane().add(splitPane);
	        
		
		splitPane.setDividerLocation(0.7);
		
		jsp1.setLayout(new GridLayout(gridSize,gridSize));
		for (int i = 0; i <gridSize; i++){
			for(int j = 0; j < gridSize; j++){
				squares[i][j] = new JButton();
				jsp1.add(squares[i][j]);
				
			}
		}
		
		btnMove = new JButton();
		btnMove.addActionListener(new ActionListener()
		    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  count = count + 1; 
		    	  move = ms.MoveShip();
					
		    	  commandManager.executeCommand(new MoveCommand(ms.getX(), ms.getY(), ms, Home.this ));
		    	  
					//squares[ms.getX()][ms.getY()].setText("");
					//ms.setX(move.x);
					//ms.setY(move.y);
					//squares[ms.getX()][ms.getY()].setText(ms.getType());
					//BattleShooter bs = new BattleShooter();
					//ms.registerObserver(bs);
					//ms.changeMode("Attack!");
					
					if (count == 3){
						setTheFactory(new ShipFactory());
			        	Random rand = new Random();

			        	int  n = rand.nextInt(3) + 1;
			        	
			        	Ship ship;
						ship = theFactory.createShip(n);
						squares[0][0].setText(ship.getType());
						move = ship.MoveShip();
						squares[ship.getX()][ship.getY()].setText("");
						ship.setX(move.x);
						ship.setY(move.y);
						squares[ship.getX()][ship.getY()].setText(ship.getType());
						count = 0;
					}
		        
		      }
		    });
		btnUndo = new JButton();
		btnUndo.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  commandManager.undo();
	    	  
	      }
	    });
		btnOffensive = new JButton();
		btnOffensive.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	 
	    	  ms.changeMode("Offensive!");
	      }
	    });
		btnDefensive = new JButton();
		btnDefensive.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    
	    	  ms.changeMode("Defensive");
	      }
	    });
		btnMove.setText("Move");
		btnUndo.setText("Undo");
		btnOffensive.setText("Offensive");
		btnDefensive.setText("Defensive");
		jsp2.add(btnMove);
		jsp2.add(btnUndo);
		jsp2.add(btnOffensive);
		jsp2.add(btnDefensive);
		
	
	      setTitle("Sky Wars");
	     
	     setBounds(100, 100, 450, 300);
		
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	



	public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("btnMove"))
        {
        	setTheFactory(new ShipFactory());
        	Random rand = new Random();

        	int  n = rand.nextInt(3) + 1;
        	
        	Ship ship;
			ship = this.theFactory.createShip(n);
			squares[0][0].setText(ship.getType());
            
            
        }
    }
	public void btnMovePressed(ActionEvent e)
    {
        if(e.getActionCommand().equals("btnMove"))
        {
//        	JOptionPane.showMessageDialog(null, "HI", "InfoBox: " + "HI", JOptionPane.INFORMATION_MESSAGE);
//        	moves = NeighbourNodes.PossibleMoves(x, y);
//			int move;
//			move = rand.nextInt(moves.size());
//			squares[x][y].setText("");
//			x = ((int)moves.get(move).getX());
//			y = ((int)moves.get(move).getY());
//			squares[x][y].setText(Game.ms.getType());
            
            
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



