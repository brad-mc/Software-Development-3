
public class BuyCoffee {
	
	public static void main (String[] args){
		
		Coffee myCoffee = new DarkRoast();
		myCoffee = new Milk(myCoffee);
		myCoffee = new Syrup(myCoffee);
		
		System.out.println(myCoffee.getDescription() + " "+myCoffee.cost());
	}

}
