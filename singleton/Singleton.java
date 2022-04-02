package by.epam.pattern.singleton;

public class Singleton {
	
	private static Singleton instance;
	
	static {
		instance = new Singleton();
	}
	
	private Singleton() {
		//
	}
	
	public static Singleton getInstnance() {
		return instance;
	}

}
