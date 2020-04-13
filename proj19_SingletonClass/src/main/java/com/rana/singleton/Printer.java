package com.rana.singleton;

public class Printer {

	private static Printer INSTANCE;

	private Printer() {
		//no operation
		System.out.println("0 param cons");
	}

	// static factory method.........
	public static Printer getInstance() {
		if (INSTANCE == null)
			INSTANCE =  new Printer();
		return INSTANCE;
	}
	
	public void printMsg(String msg) {
		msg += " printed on paper";
		System.out.println(msg);
	}
}
