//Interface to ensure objects that are observable implement the below methods 
public interface Observable {
	
	public void registerObserver(Ship s);
	public void removeObserver(Ship s);
	public void notifyObservers();

}
