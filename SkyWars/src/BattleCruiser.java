import javax.swing.JOptionPane;

public class BattleCruiser extends Ship implements ShipObserver {
	
	public BattleCruiser()
	{   //Sets the type of ship
		setType("Battle Cruiser");
	}
	public void update (String mode){
		//update method uses to store the master ships mode
		this.setEnemyMode(mode);
		
	}

}
