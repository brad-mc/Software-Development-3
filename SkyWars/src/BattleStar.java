import javax.swing.JOptionPane;

public class BattleStar extends Ship implements ShipObserver {
	
	
	public BattleStar()
	{
		setType("Battle Star.");
	}
	
	public void update (String mode){
		this.setEnemyMode(mode);
		//JOptionPane.showMessageDialog(null, this.enemyMode, "InfoBox: " + "MODE", JOptionPane.INFORMATION_MESSAGE);
	}

}
