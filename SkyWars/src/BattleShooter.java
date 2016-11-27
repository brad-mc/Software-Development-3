import javax.swing.JOptionPane;

public class BattleShooter extends Ship implements ShipObserver {
	private String enemyMode;
	public BattleShooter()
	{
		setType("Battle Shooter");
	}
	
	public void update (String mode){
		this.enemyMode = mode;
		JOptionPane.showMessageDialog(null, this.enemyMode, "InfoBox: " + "MODE", JOptionPane.INFORMATION_MESSAGE);
	}

}
