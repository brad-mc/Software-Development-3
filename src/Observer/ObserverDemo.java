package Observer;

public class ObserverDemo {
	
	public static void main (String[] args){
		
		PopStar Jason  = new PopStar();
		PopStar Queen = new PopStar();
		Fans f1 = new Fans("Steven",Jason);
		Fans f2 = new Fans("Mike",Jason);
		Fans f3 = new Fans("Jess",Queen);
		Fans f4 = new Fans("Emily",Queen);
		
		Jason.registerObserver(f4);
		Jason.freshNews("New album out");
		
		Jason.removeObserver(f1);
		
		
		
		Jason.freshNews("New Alubum Cancelled");
		
		Queen.freshNews("Going on tour");
		
		
		
		
		
		
		
	}

}
