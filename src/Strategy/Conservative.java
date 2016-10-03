package Strategy;

public class Conservative extends MP {
	
	public Conservative(){
		this.belief = new KnowBest();
		this.house = new BigDetachedHouses();
	}

}
