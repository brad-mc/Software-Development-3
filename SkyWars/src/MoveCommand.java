
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
	
	// The move command stores the pervious and next state to allow for undoing
	public MoveCommand(int x, int y, Ship s, Home h){
		
		this.h = h;
		this.s = s;
		previousState = new Point(x,y);
		nextState = s.MoveShip();
	}
	//The execute method moves the ship 
	public void execute() {
		ArrayList<Ship> same = new ArrayList<Ship>();
		String prev;
       	String after;
       	
	 
	   
		        prev = h.squares[previousState.x][previousState.y].getText();
		        //Removes the ship name from previous square
		        after = prev.replaceFirst(s.getType(),"");
		        h.squares[previousState.x][previousState.y].setText(after);
		       //Sets ship to new location
		        s.setX(nextState.x);
		        s.setY(nextState.y);
		        //Shows on the board
		        h.squares[s.getX()][s.getY()].setText(h.squares[s.getX()][s.getY()].getText() + "" + s.getType());
	}
	
	
    
    
    public void undo() {
    	//Undo
    	h.squares[nextState.x][nextState.y].setText("");
    	h.squares[previousState.x][previousState.y].setText(s.getType());
    	 s.setX(previousState.x);
         s.setY(previousState.y);
    
    }
	

}
