
public abstract class Problem {
	
protected CandIT candit;

	
	public abstract void solveProblem();

	public CandIT getCandIT() {
		return this.candit;
	}

	public void setCandIT(CandIT candit) {
		this.candit = candit;
	}
	

}
