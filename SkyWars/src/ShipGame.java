

public class ShipGame {
	
ShipFactory theFactory;
	
	public ShipGame(){
		
		setTheFactory(new ShipFactory());
	}
		
		public void playGame(int type){
			Ship ship;
			ship = this.theFactory.createShip(type);
			//ball.announceWinner();
		}
	
	

	public void setTheFactory(ShipFactory theFactory) {
		this.theFactory = theFactory;
	}

}
