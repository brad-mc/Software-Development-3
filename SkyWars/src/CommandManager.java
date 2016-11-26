
public class CommandManager {
	
	private Command lastCommand;
	
	public CommandManager(){}
	
	public void executeCommand(Command c){
		
		c.execute();
		lastCommand = c;
	}
	
	public boolean isUndoAvalible(){
		return lastCommand !=null;
	}
	
	public void undo(){
		assert(lastCommand != null);
		lastCommand.undo();
		lastCommand = null;
	}

}
