
public class MediumPriorityProblem extends Problem {

	@Override
	public void solveProblem() {
		this.candit.investigateThis(" Medium Priority Problem");

	}
	
	public MediumPriorityProblem(CandIT candit) {
		setCandIT(candit);
	}
	
	public int priority = 2;
	
	

}
