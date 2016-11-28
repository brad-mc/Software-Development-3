import javax.swing.JOptionPane;

public class BattleCruiser extends Ship implements ShipObserver {
	
	public BattleCruiser()
	{
		setType("Battle Cruiser.");
	}
	public void update (String mode){
		this.setEnemyMode(mode);
		//JOptionPane.showMessageDialog(null, this.enemyMode, "InfoBox: " + "MODE", JOptionPane.INFORMATION_MESSAGE);
	}

}
