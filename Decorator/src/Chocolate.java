
public class Chocolate extends Extras {

Coffee coffee;
	
	public Chocolate(Coffee coffee){
		setCoffee(coffee);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost() + 0.75;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + "With Chocolate";
	}
	
	public void setCoffee(Coffee coffee){
		this.coffee = coffee;
	}

}
