
public interface Observable {
	
	public void registerObserver(Ship s);
	public void removeObserver(Ship s);
	public void notifyObservers();

}
