package com.rana.beans;

public class ClassB {
	
	
	ClassA a;
	public ClassB() {
		super();
		System.out.println("ClassB.ClassB()::0 param constructor");
	}
	
	public void setA(ClassA a) {
		this.a = a;
	}
	
}
