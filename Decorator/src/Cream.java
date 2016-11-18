
public class Cream extends Extras {

Coffee coffee;
	
	public Cream(Coffee coffee){
		setCoffee(coffee);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost() + 1.00;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + "With Cream ";
	}
	
	public void setCoffee(Coffee coffee){
		this.coffee = coffee;
	}

}
