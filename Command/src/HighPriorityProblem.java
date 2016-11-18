
public class HighPriorityProblem extends Problem {

	@Override
	public void solveProblem() {
		this.candit.investigateThis(" High Priority Problem");


	}
	
	public HighPriorityProblem(CandIT candit) {
		setCandIT(candit);
	}
	
	public int priority = 1;
	
	
	

	

}
