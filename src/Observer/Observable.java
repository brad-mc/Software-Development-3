package Observer;

public interface Observable {
	
	public void registerObserver(Fans o);
	public void removeObserver(Fans o);
	public void notifyObservers();

}
