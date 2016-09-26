package Observer;

import java.util.ArrayList;

public class PopStar {
	private ArrayList<Fans> myFans = new ArrayList<Fans>();
	private String news;
	
	public void registerObserver(Fans fan){
		this.myFans.add(fan);
	}
	
	public void removeObserver(Fans fan){
		this.myFans.remove(fan);
	}
	
	public void notifyObservers(){
		for (Fans tempFans: this.myFans){
			tempFans.update(news);
		}
	}
	
	public void freshNews(String news){
		setNews(news);
		notifyObservers();
	}
	
	public void setNews(String news){
		this.news = news;
	}

}
