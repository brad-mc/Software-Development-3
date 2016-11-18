package Strategy;

public class Green extends MP {
	
	public Green(){
		this.belief = new Recycle();
		this.house = new Trees();
	}

}
