//Singleton Pattern
public class BigBang {
	
	public static void main (String[] args){
		Universe universe = Universe.getInstance();
		Universe universe2 = Universe.getInstance();
		if(universe.equals(universe2)) {
			System.out.println("only one");
		} else {
			System.out.println("there are two!");
		}
		
		
	}

}
