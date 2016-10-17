
public class LowPriorityProblem extends Problem {

	@Override
	public void solveProblem() {
		this.candit.investigateThis(" Low Priority Problem");

	}
	
	public LowPriorityProblem(CandIT candit) {
		setCandIT(candit);
	}
	
	public int priority = 3;

}
