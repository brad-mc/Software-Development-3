import javax.swing.JOptionPane;

public class BattleShooter extends Ship implements ShipObserver {

	
	public BattleShooter()
	{    //Sets the type of ship
		setType("Battle Shooter");
	}
	
	public void update (String mode){
		//update method uses to store the master ships mode
		this.setEnemyMode(mode);
		
	}

}
