
public class PolicyImplementation {
	
	PolicyFactory thinkTank;
	
	public PolicyImplementation(){
		setThinkTank(new PolicyFactory());
	}
	
	public void implementPolicy(String policyType){
		Policy policy;
		
		policy = this.thinkTank.createPolicy(policyType);
		policy.announcePolicy();
	}
	
	public void setThinkTank (PolicyFactory thinkTank){
		this.thinkTank = thinkTank;
	}

}
