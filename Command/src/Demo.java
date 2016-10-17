
public class Demo {
	
	public static void main (String[] args){
		CandIT candit = new CandIT();
		ProblemReport problemReport = new ProblemReport();
		
		Problem computerBroke = new HighPriorityProblem(candit);
		Problem forgotPassword = new LowPriorityProblem(candit);
		Problem emailNotSending = new MediumPriorityProblem(candit);
		Problem forgotUsername = new LowPriorityProblem(candit);
		Problem laptopFire = new HighPriorityProblem(candit);
		
		problemReport.reportProblem(computerBroke);
		problemReport.reportProblem(forgotPassword);
		problemReport.reportProblem(emailNotSending);
		problemReport.reportProblem(forgotUsername);
		problemReport.reportProblem(laptopFire);
		
		problemReport.assignProblemToOperator();
	}

}
