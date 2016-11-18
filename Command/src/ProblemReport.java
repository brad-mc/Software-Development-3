import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ProblemReport {

	private ArrayList <Problem> incidents = new ArrayList <Problem> ();
	
	public void reportProblem (Problem incident){
		this.incidents.add(incident);
		
		
		
		
	}
	
	public void assignProblemToOperator(){
		for(Problem prob : this.incidents) {
			prob.solveProblem();
		}
	}
	
	
		
	



}
