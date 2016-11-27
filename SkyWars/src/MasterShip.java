import java.util.ArrayList;

public class MasterShip implements Observable {
	private ArrayList<Ship> ships = new  ArrayList<Ship>();
	private String mode;
	private String type;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	private int x;
	private int y;
	
	
	
	
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public void changeMode(String mode){
		setMode(mode);
		notifyObservers();
	}

	public MasterShip()
	{
		setType("Master Ship");
	}
	
	public void registerObserver(Ship s){
		this.ships.add(s);
	}
	public void removeObserver(Ship s){
		this.ships.remove(s);
	}
	public void notifyObservers(){
		for(Ship s: this.ships){
			s.update(getMode());
		}
	}

}
