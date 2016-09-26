package Observer;

public class ObserverDemo {
	
	public static void main (String[] args){
		
		PopStar Jason = new PopStar();
		Fans f1 = new Fans("Steven",Jason);
		Fans f2 = new Fans("Mike",Jason);
		
		Jason.freshNews("New album out");
		
		
		
	}

}
