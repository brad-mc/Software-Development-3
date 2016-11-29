import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MasterShip extends Ship implements Observable {
	//Holds array of ships that are observing the Master Ship
	public ArrayList<Ship> ships = new  ArrayList<Ship>();
	//Holds the mode of the ship
	private String mode;
	//Holds the type of ship 
	private String type;
	//Holds a string path to an audio file
	String explosion = "src/Explosion.wav";
	//Holds a string path to an audio file
	String gameOver = "src/Game_Over.wav";
	//Creates a new Audio Player
    Audio player = new Audio();
    
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
		setType("MASTER SHIP");
	}
	//Registers Observers
	public void registerObserver(Ship s){
		this.ships.add(s);
	}
	//Removes Observers 
	public void removeObserver(Ship s){
		this.ships.remove(s);
	}
	
	//Notify the observing ships of a change 
	public void notifyObservers(){
		for(Ship s: this.ships){
			s.update(getMode());
		}
	}
	
	@Override
	public void update(String s) {
	    throw new UnsupportedOperationException();
	}
	
	//Method to determine conflicts with the Master Ship 
	public void Winner(Home h){
		
		ArrayList<Ship> same = new ArrayList<Ship>();
		int c = 0;
		//Loop to work out if any ships currently occupy the same position as the master ship
		for(Ship sh: ships){
    		int x;
    		int y;
    		
    		x = sh.getX();
    		y = sh.getY();

    		if(x == this.getX() & y == this.getY()){
    			same.add(sh);
    			c = c + 1;
    		}



    	}
		
		//If so and there is only one enemy ship in the same position it is destroyed 

    	if (c == 1){
    		System.out.println("Master Ship Destroyed a " + same.get(0).getType());
    		//Label shows that the enemy ship has been destroyed 
    		h.status.setText("Master Ship Destroyed a " + same.get(0).getType());
    		//An explosion is played
    		player.play(explosion);
    		//Removes the ship from the observers list
    		this.removeObserver(same.get(0));
    		//Makes the square only now show the master ship 
    		h.squares[this.getX()][this.getY()].setText(this.getType());
    		
    	
    	}
           //If there are two ships the winner depends on the mode of the master ship 
    	else if (c >= 2 & this.getMode() == "Defensive"){
    		System.out.println("Game Over");
    		//Sets the label to GAME OVER
    		h.status.setText("GAME OVER");
    		//Plays the game over sound
    		player.play(gameOver);
    		//Removes the Ships from the list 
    		this.removeObserver(same.get(0));
    		this.removeObserver(same.get(1));
    		//Shows the master ship with the other ships
    		h.squares[this.getX()][this.getY()].setText(h.squares[this.getX()][this.getY()].getText() + "" + this.getType());
    		//A message box shows GAME Over
    		JOptionPane.showMessageDialog(null, "Game Over", "You Lost", 1);
    		//The observer list is cleared
    		ships.clear();
    		//The screen is reset
    		h.dispose();
    		//The game is reset
    		Game.main(null);

    	}
    	else if (c >= 2 & this.getMode() == "Offensive"){
    		System.out.println("Master Ship Destroyed 2 Ships a " + same.get(0).getType() + "and a " + same.get(1).getType() );
    		h.status.setText("Master Ship Destroyed 2 Ships a " + same.get(0).getType() + "and a " + same.get(1).getType());
    		player.play(explosion);
    		ships.remove(same.get(0));
    		ships.remove(same.get(1));
    		h.squares[this.getX()][this.getY()].setText(this.getType());
    		
    	}
    	else if(c >= 3 ){
        		   	h.squares[this.getX()][this.getY()].setText(h.squares[this.getX()][this.getY()].getText() + "" + this.getType());
        		   	ships.remove(same.get(0));
		    		ships.remove(same.get(1));
		    		ships.remove(same.get(2));
		    		h.status.setText("GAME OVER");
		    		player.play(gameOver);
		    		//A message box shows GAME Over
		    		JOptionPane.showMessageDialog(null, "Game Over", "You Lost", 1);
		    		//The observer list is cleared
		    		ships.clear();
		    		//The screen is reset
		    		h.dispose();
		    		//The game is reset
		    		Game.main(null);
		    		
        	        System.out.println("Game Over 3");
        	  
        		}
	}

}
