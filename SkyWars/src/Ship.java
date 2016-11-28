import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public abstract class Ship implements ShipObserver {
	
	private String enemyMode;
	
	public String getEnemyMode() {
		return enemyMode;
	}

	public void setEnemyMode(String enemyMode) {
		this.enemyMode = enemyMode;
	}

	private int x;
	
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

	private int y;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	
	public Point MoveShip (){
		ArrayList<Point> moves = new ArrayList<Point>();
		Random rand = new Random();
		Point move = new Point(0,0);
		if (this.getX() > 0) {     // has north
		     Point p = new Point(this.getX()-1,this.getY());
			moves.add(p);
			
		}
		if (this.getX() < 3) { // has south
			Point p = new Point(this.getX()+1,this.getY());
			moves.add(p);
		    }
		    if (this.getY() > 0) {     // has west
		    	Point p = new Point(this.getX(),this.getY()-1);
				moves.add(p);
		    }
		    if (this.getY() < 3) { // has east
		    	Point p = new Point(this.getX(),this.getY()+1);
				moves.add(p);
		    }
		    int i;
			i = rand.nextInt(moves.size());
			move.x = (int) moves.get(i).getX();
			move.y = (int) moves.get(i).getY();
		    
			return move;
	}

}
