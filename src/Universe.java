//Singleton Pattern
public class Universe {
	
	private static Universe uniqueInstance;
	
	private Universe(){}
	
	public static synchronized Universe getInstance(){
		if(uniqueInstance ==null){
			uniqueInstance = new Universe();
		}
		return uniqueInstance;
	}

}
