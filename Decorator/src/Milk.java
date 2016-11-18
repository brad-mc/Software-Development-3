
public class Milk extends Extras {

Coffee coffee;
	
	public Milk(Coffee coffee){
		setCoffee(coffee);
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return this.coffee.cost() + 0.10;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.coffee.getDescription() + "With Milk ";
	}
	
	public void setCoffee(Coffee coffee){
		this.coffee = coffee;
	}

}
