package Strategy;

public class Labour extends MP {
	
	public Labour(){
		this.belief = new HaveAJob();
		this.house = new ModestHouses();
	}

}
