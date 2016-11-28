import javax.swing.JOptionPane;

public class BattleShooter extends Ship implements ShipObserver {

	
	public BattleShooter()
	{
		setType("Battle Shooter.");
	}
	
	public void update (String mode){
		this.setEnemyMode(mode);
		//JOptionPane.showMessageDialog(null, this.enemyMode, "InfoBox: " + "MODE", JOptionPane.INFORMATION_MESSAGE);
	}

}
