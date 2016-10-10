
public class PolicyFactory {
	

	
	public Policy createPolicy(String policyType){
		Policy policy = null;
		
		if (policyType.equalsIgnoreCase("Education")){
			policy = new Education();
		}
		if (policyType.equalsIgnoreCase("Transport")){
			policy = new Transport();
		}
		if (policyType.equalsIgnoreCase("Defence")){
			policy = new Defence();
			
		}
		if (policyType.equalsIgnoreCase("Health")){
			policy = new Health();
			
		}
		return policy;
	}
	

	

}
