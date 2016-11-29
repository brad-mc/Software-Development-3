import java.util.Stack;

public class CommandManager {
	//Stack holds the previous positions of ships to allow for undo
	private Stack<Command> undos = new Stack<Command>();
	
	public CommandManager(){}
	
	
	public void executeCommand(Command c){
		//Executes the command
		c.execute();
		//Adds command to stack
		undos.push(c);
	}
	
	public boolean isUndoAvalible(){
		return !undos.empty();
	}
	
	public void undo(){
		assert(!undos.empty());
		//Gets the last command from the undo stack calls the undo method
		Command command = undos.pop();
        command.undo();
       
	}

}
