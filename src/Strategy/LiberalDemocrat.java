package Strategy;

public class LiberalDemocrat extends MP {
	
	public LiberalDemocrat(){
		this.belief = new DaftPublic();
		this.house = new CloudCuckoo();
	}

}
