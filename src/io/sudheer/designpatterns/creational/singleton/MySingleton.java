package io.sudheer.designpatterns.creational.singleton;

public class MySingleton {

	// Eager Loading - created as soon as class is loaded into JVM
	//private static MySingleton instance = MySingleton();
	
	// Lazy Loading - singleton instance created only when required
	private static MySingleton instance = null;
	
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		
		// Lazy Loading - singleton instance created only when required
		if (instance == null) {
			instance = new MySingleton();
		}
		
		return instance;
	}
	
}
