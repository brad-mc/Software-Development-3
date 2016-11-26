import java.awt.List;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.ArrayList;

import javax.xml.soap.Node;

public class NeighbourNodes {
	
	public static ArrayList<Point> PossibleMoves (int x, int y){
		ArrayList<Point> moves = new ArrayList<Point>();
		
		if (x > 0) {     // has north
		     Point p = new Point(x-1,y);
			moves.add(p);
			
		}
		if (x < 3) { // has south
			Point p = new Point(x+1,y);
			moves.add(p);
		    }
		    if (y > 0) {     // has west
		    	Point p = new Point(x,y-1);
				moves.add(p);
		    }
		    if (y < 3) { // has east
		    	Point p = new Point(x,y+1);
				moves.add(p);
		    }
		    
		    return moves;

}
}
