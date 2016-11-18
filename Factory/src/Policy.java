
public abstract class Policy {
	
protected String policy;
protected String policyType;
	
	public String getPolicyType() {
	return policyType;
}

public void setPolicyType(String policyType) {
	this.policyType = policyType;
}

	public String getPolicy() {
	return policy;
}

public void setPolicy(String policy) {
	this.policy = policy;
}

	public void announcePolicy() {
		System.out.println("This government will " +getPolicy());
	}

}
