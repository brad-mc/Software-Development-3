
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class MoveCommand implements Command {
	
	private Home h;
	private Ship s;
	private Point previousState;
	private Point nextState;
	
	public MoveCommand(int x, int y, Ship s, Home h){
		
		this.h = h;
		this.s = s;
		previousState = new Point(x,y);
		nextState = s.MoveShip();
	}
	
	public void execute() {
		String prev;
       	String after;
       	String occupants;
	    String[] sh;
	    int c;
		 if (s instanceof MasterShip){

		       	


		       	prev = h.squares[previousState.x][previousState.y].getText();
		        after = prev.replace(s.getType(),"");
		        h.squares[previousState.x][previousState.y].setText(after);
		        s.setX(nextState.x);
		        s.setY(nextState.y);
		         if(h.squares[s.getX()][s.getY()].getText() == ""){
		    	   h.squares[s.getX()][s.getY()].setText(s.getType()); 
		    	}
		    	else{
		    		
		    	    occupants = h.squares[s.getX()][s.getY()].getText();
		            sh = occupants.split("\\.");
		            List<String> ships = Arrays.asList(occupants.split("\\."));
		            c = ships.size();
		            if(c == 1){
		        	   h.squares[s.getX()][s.getY()].setText(s.getType());
		            }
		            if(c >= 2 & s.getEnemyMode() == "Defensive"){
		        	   System.out.println("Game Over");
		        	  
		        		  }
		        		  else{
		        		  	h.squares[s.getX()][s.getY()].setText(s.getType());
		        		  }
		            if(c >= 3 ){
		            	System.out.println("Game Over");
		        	  
		        		}
		            
		            }

		    	}

		    	else{

		    		prev = h.squares[previousState.x][previousState.y].getText();
		            after = prev.replace(s.getType(),"");
		            h.squares[previousState.x][previousState.y].setText(after);
		            s.setX(nextState.x);
		            s.setY(nextState.y);
		            if(h.squares[s.getX()][s.getY()].getText() == ""){
		    	    h.squares[s.getX()][s.getY()].setText(s.getType()); 
		    	    }
		    	    occupants = h.squares[s.getX()][s.getY()].getText();
		    	    if(occupants.contains("Master Ship.")){
		    	    	
		                List<String> ships = Arrays.asList(occupants.split("\\."));
		                c = ships.size();
		                if(c == 1){}
		                if(c >= 2 & s.getEnemyMode() == "Defensive"){
		                	h.squares[s.getX()][s.getY()].setText(h.squares[s.getX()][s.getY()].getText() + "" + s.getType());
		        	        JOptionPane.showMessageDialog(null, "GAME OVER", "InfoBox: " + "MODE", JOptionPane.INFORMATION_MESSAGE);
		        	  
		        		  }	
		        		   if(c >= 3 ){
		        		   	h.squares[s.getX()][s.getY()].setText(h.squares[s.getX()][s.getY()].getText() + "" + s.getType());
		        		   	System.out.println("Game Over");;
		        	  
		        		}
		            

		    	    }

		              else{
		    	    	h.squares[s.getX()][s.getY()].setText(h.squares[s.getX()][s.getY()].getText() + "" + s.getType());
		    	    }



		    	    }



	
    }
    //
    public void undo() {
    	
    	h.squares[nextState.x][nextState.y].setText("");
    	h.squares[previousState.x][previousState.y].setText(s.getType());
    	 s.setX(previousState.x);
         s.setY(previousState.y);
       // model.spaces = previousGridState;
       // model.playerXTurn = previousTurnState;
    }
	

}
