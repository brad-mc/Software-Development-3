
public class ShipFactory {
	//Factory for creating ship 
	public Ship createShip(int type){
		Ship ship = null;
		if (type == 1){
			ship = new BattleShooter();
		}
		if (type==2){
			ship = new BattleCruiser();
		}
		if (type==3){
			ship = new BattleStar();
		}
		
		return ship;
	}

}
