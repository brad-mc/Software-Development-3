package Observer;

import javax.swing.JOptionPane;

public class Fans implements Observer, DisplayElement {
	private String name;
	private String popStarUpdates;
	private PopStar favPopStar;
	
	public Fans (String name, PopStar popstar){
		setName(name);
		setFavPopStar(popstar);
		
	}
	private void setName(String name){
		this.name=name;
		
	}
	
	private void setFavPopStar(PopStar popstar){
		this.favPopStar = popstar;
		this.favPopStar.registerObserver(this);
	}
	
	public void update(String news){
		this.popStarUpdates = news;
		display();
	}
	
	public void display(){
		String output = "News for " +this.name+"\n";
		output = output + this.popStarUpdates;
		JOptionPane.showMessageDialog(null, output,"",JOptionPane.INFORMATION_MESSAGE);
	}


}
