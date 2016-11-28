import java.awt.Point;

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
       h.squares[previousState.x][previousState.y].setText("");
       s.setX(nextState.x);
       s.setY(nextState.y);
       h.squares[s.getX()][s.getY()].setText(s.getType());
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
