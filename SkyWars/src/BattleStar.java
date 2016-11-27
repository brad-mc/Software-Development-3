import javax.swing.JOptionPane;

public class BattleStar extends Ship implements ShipObserver {
	private String enemyMode;
	public BattleStar()
	{
		setType("Battle Star");
	}
	
	public void update (String mode){
		this.enemyMode = mode;
		JOptionPane.showMessageDialog(null, this.enemyMode, "InfoBox: " + "MODE", JOptionPane.INFORMATION_MESSAGE);
	}

}
