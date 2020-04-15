package com.rana.singleton;

public class StaticMethodSingleton {
    static public StaticMethodSingleton INSTANCE;
	
	private StaticMethodSingleton() {
		// no op
	}

	static public StaticMethodSingleton getInstance() {
		
		if(INSTANCE == null)
			INSTANCE = new StaticMethodSingleton();
		return INSTANCE;
	}
}
