import java.awt.Color;
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
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Home extends JFrame implements ActionListener {
	//Factory Variable for Factory Pattern
	ShipFactory theFactory;
	int count = 0;
	//Point variable to store move
	static Point move = new Point();
	//Command manager variable to store command manager to enable undos
	private CommandManager commandManager;
	//GUI buttons declared
    public JButton btnMove,btnUndo,btnOffensive,btnDefensive,btnAmbush,btnRestart;
    //GUI Label declared
	public JLabel status;
	//Size of grid declared
	public static final int gridSize = 4;
	//Array of button to make up game board
	public JButton[][] squares = new JButton[gridSize][gridSize];
	
	Random rand = new Random();
	
	public Home(MasterShip ms){
		
		commandManager = new CommandManager();
		//Two JPanels declared to allow for split
		 JPanel jsp1 = new JPanel();
	     JPanel jsp2 = new JPanel();
	     //JPane split to allow for controls at the bottom board at the top
	     JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, 
	                true, jsp1, jsp2);
	     
	     splitPane.setOneTouchExpandable(true);
	        getContentPane().add(splitPane);
	        
		//Sets the split point on the pane
	        splitPane.setResizeWeight(0.8);
		//Adds a grid layout to the top split pane
		jsp1.setLayout(new GridLayout(gridSize,gridSize));
		//Loop to add the grid buttons to create the board
		for (int i = 0; i <gridSize; i++){
			for(int j = 0; j < gridSize; j++){
				squares[i][j] = new JButton();
				squares[i][j].setBackground(Color.BLACK);
				squares[i][j].setForeground(Color.WHITE);
				jsp1.add(squares[i][j]);
				
			}
		}
		//Move button declared
		btnMove = new JButton();
		//Move button action listener to allow execution of code on click 
		btnMove.addActionListener(new ActionListener()
		    {
		      public void actionPerformed(ActionEvent e)
		      {
		    	  
		    	  
		    	  //Disables the move button until completion
		    	  btnMove.setEnabled(false);
		    	  //Count variable to allow for the creation of new ships
		    	  count = count + 1; 
		    	 //Gets the move that the master ship will make
		    	  move = ms.MoveShip();
		    	  
		    	  //Sends the move to the command manager to be executed
		    	  commandManager.executeCommand(new MoveCommand(ms.getX(), ms.getY(), ms, Home.this));
		    	//Calls the winner method to see if any ships have been attacked
		    	  ms.Winner(Home.this);
		    	  
		    	  //Creates a new thread to enable the code to run while programme continues
		    	  Thread t = new Thread(new Runnable() {
		    	         public void run()
		    	         {
		    	        	 try {
		   		    		  //Loops around all ships that have been created moving them 
		    	        		 for(Ship sh: ms.ships){
		   		    			  TimeUnit.MILLISECONDS.sleep(500);
		   		    			  //Sends the command to the command manager
		   			    		  commandManager.executeCommand(new MoveCommand(sh.getX(), sh.getY(), sh, Home.this ));
		   		    	  }
		    	        		 //Checks for attacks
		   		    		ms.Winner(Home.this); 
		   		    		//enables the move button again 
		   					btnMove.setEnabled(true);
		   				} catch (InterruptedException e1) {
		   					// TODO Auto-generated catch block
		   					e1.printStackTrace();
		   				}
		    	         }
		    	});
		    	  //starts the thread 
		    	 t.start();
		    	  
			    	  
					//Creates a new ship at random
					if (count == 3){
						setTheFactory(new ShipFactory());
			        	Random rand = new Random();

			        	int  n = rand.nextInt(3) + 1;
			        	
			        	Ship ship;
						ship = theFactory.createShip(n);
						//Adds the ship to the board
						squares[0][0].setText(squares[0][0].getText() + "" + ship.getType());
						//Registers the ship as an observer of the master ship
						ms.registerObserver(ship);
					
						count = 0;
					}
		        
		      }
		    });
		btnUndo = new JButton();
		//Undo button allows for moves to be undone
		btnUndo.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  //calls the undo command in the command manager 
	    	  commandManager.undo();
	    	  
	      }
	    });
		
		btnOffensive = new JButton();
		//Button to change the mode of the master ship 
		btnOffensive.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  //Changes the color of the button to represent the mode
	    	  btnDefensive.setBackground(Color.RED);
	    	  //Changes the mode of the ship 
	    	  ms.changeMode("Offensive");
	    	  btnOffensive.setBackground(Color.GREEN);
	      }
	    });
		
		btnDefensive = new JButton();
		//Changes the color of the button to represent the mode
		btnDefensive.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	  
	          btnOffensive.setBackground(Color.RED);
	        //Changes the mode of the ship 
	    	  ms.changeMode("Defensive");
	    	  btnDefensive.setBackground(Color.GREEN);
	      }
	    });
		
		btnAmbush = new JButton();
		//Special button spawns 10 enemy ships
		btnAmbush.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	   for(int i = 0; i < 10; i ++){
	    		setTheFactory(new ShipFactory());
	        	Random rand = new Random();

	        	int  n = rand.nextInt(3) + 1;
	        	
	        	Ship ship;
				ship = theFactory.createShip(n);
				squares[0][0].setText(squares[0][0].getText() + "" + ship.getType());
				ms.registerObserver(ship);
	    	   }
	    
	    	  
	      }
	    });
		btnRestart = new JButton();
		//Restarts the game
		btnRestart.addActionListener(new ActionListener()
	    {
	      public void actionPerformed(ActionEvent e)
	      {
	    	    ms.ships.clear();
	    		dispose();
	    		Game.main(null);
	    	  
	      }
	    });
		
		status = new JLabel();
		//Adds text to the buttons
		btnMove.setText("Move");
		btnUndo.setText("Undo");
		btnOffensive.setText("Offensive");
		btnDefensive.setText("Defensive");
		btnAmbush.setText("Ambush");
		btnRestart.setText("Restart");
		//Adds the buttons and Label to the lower part of the split frame
		jsp2.add(btnMove);
		jsp2.add(btnUndo);
		jsp2.add(btnOffensive);
		jsp2.add(btnDefensive);
		jsp2.add(btnAmbush);
		jsp2.add(btnRestart);
		jsp2.add(status);
		//Sets the default mode colour
		btnDefensive.setBackground(Color.GREEN);
		
	
	      setTitle("Sky Wars");
	     
	     setBounds(100, 100, 1000, 700);
		
		
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
	}
	



	

    
	
	public void setTheFactory(ShipFactory theFactory) {
		this.theFactory = theFactory;
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}



