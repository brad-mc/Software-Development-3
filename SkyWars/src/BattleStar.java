import javax.swing.JOptionPane;

public class BattleStar extends Ship implements ShipObserver {
	
	
	public BattleStar()
	{   //Sets the type of ship
		setType("Battle Star");
	}
	
	public void update (String mode){
		//update method uses to store the master ships mode
		this.setEnemyMode(mode);
		
	}

}
