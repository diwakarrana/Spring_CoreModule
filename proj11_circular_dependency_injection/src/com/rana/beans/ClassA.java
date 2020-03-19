package com.rana.beans;

public class ClassA {
	
	

	ClassB b;

	public ClassA() {
		super();
		System.out.println("ClassA.ClassA():0 param constructor");
	}
	
	
	public void setB(ClassB b) {
		this.b = b;
	}
	
	
}
