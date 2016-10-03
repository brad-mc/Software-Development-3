package Strategy;

public abstract class MP {
	protected Belief belief;
	protected Houses house;
	private String fname;
	private String sname;
	private String constituency;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getConstituency() {
		return constituency;
	}
	public void setConstituency(String constituency) {
		this.constituency = constituency;
	}
	
	public Belief getBelief(){
		return this.belief;
	}
	
	public void setBelief(Belief belief){
		this.belief = belief;
	}
	public Houses getHouse(){
		return this.house;
	}
	
	public void setHouse(Houses house){
		this.house=house;
	}
	public void sayBelief(){
		this.belief.belief();
	}
	public void houseType(){
		this.house.live();
	}
	
	
	
	
	

}
