
public class Syrup extends Extras {
	
	Coffee coffee;
	
	public Syrup(Coffee coffee){
		setCoffee(coffee);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost() + 0.50;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + "With Syrup ";
	}
	
	public void setCoffee(Coffee coffee){
		this.coffee = coffee;
	}

}
