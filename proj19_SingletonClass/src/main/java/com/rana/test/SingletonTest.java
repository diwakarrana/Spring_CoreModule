package com.rana.test;

import com.rana.singleton.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		
		Printer p1=null, p2=null;
		
		p1 = Printer.getInstance();
		p2 = Printer.getInstance();
	
		System.out.println("are these object same ? " + (p1==p2));
		
		System.out.println(p1.hashCode()+" <----> "+p2.hashCode());
		
		p1.printMsg("Hi all ");
		p2.printMsg("Hi dear ");
	}

}
