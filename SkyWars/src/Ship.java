import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

public abstract class Ship implements ShipObserver {
	
	private String enemyMode;
	
	//String allows for the storing of the mode of enemy ships
	public String getEnemyMode() {
		return enemyMode;
	}

	public void setEnemyMode(String enemyMode) {
		this.enemyMode = enemyMode;
	}

	private int x = 0;
	
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

	private int y = 0;
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	
	public Point MoveShip (){
		//Array List with possible moves 
		ArrayList<Point> moves = new ArrayList<Point>();
		Random rand = new Random();
		Point move = new Point(0,0);
		
		//The below if statements using the current position of the ship work out which moves it is elegible to make
		if (this.getX() > 0) {     // has up
		     Point p = new Point(this.getX()-1,this.getY());
			moves.add(p);
			
		}
		if (this.getX() < 3) { // has down
			Point p = new Point(this.getX()+1,this.getY());
			moves.add(p);
		    }
		    if (this.getY() > 0) {     // has right
		    	Point p = new Point(this.getX(),this.getY()-1);
				moves.add(p);
		    }
		    if (this.getY() < 3) { // has left
		    	Point p = new Point(this.getX(),this.getY()+1);
				moves.add(p);
		    }
		    
		    if(this.getX() != 0 & this.getY() != 0){ // has diagonally up left
		    	Point p = new Point(this.getX() -1,this.getY() -1);
				moves.add(p);
		    }
		    
		    
		    
		    if(this.getX() != 0 & this.getY() != 3){ // has diagonally up right
		    	Point p = new Point(this.getX() -1,this.getY() +1);
				moves.add(p);
		    }
		    
		   
		    
		    if(this.getX() != 3 & this.getY() != 3){ // has diagonally down right
		    	Point p = new Point(this.getX() +1,this.getY() +1);
				moves.add(p);
		    }
		    
		    if(this.getX() != 3 & this.getY() != 0){ // has diagonally down left
		    	Point p = new Point(this.getX() +1,this.getY() -1);
				moves.add(p);
		    }
		    int i;
		    
		    //Selects a move at random 
			i = rand.nextInt(moves.size());
			move.x = (int) moves.get(i).getX();
			move.y = (int) moves.get(i).getY();
		    
			return move;
	}

}
