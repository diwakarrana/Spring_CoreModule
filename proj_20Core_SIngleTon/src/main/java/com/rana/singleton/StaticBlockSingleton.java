package com.rana.singleton;

public class StaticBlockSingleton {
	// eager instantiation example of singleton java class 
	final static public StaticBlockSingleton INSTANCE;
	
	private StaticBlockSingleton() {
		// no operation
	}
	
	static {
		INSTANCE = new StaticBlockSingleton();
	}
	
	public static StaticBlockSingleton getInstance() {
		return INSTANCE;
	}
}
