package com.rana.test;

import com.rana.singleton.StaticMethodSingleton;

public class StaticMethodTest2 {

	public static void main(String[] args) {
		
		StaticMethodSingleton s1 = StaticMethodSingleton.getInstance();
		StaticMethodSingleton s2 = StaticMethodSingleton.getInstance();
		
		System.out.println(s1.hashCode()+"method<------>"+s2.hashCode());
		
	}
}
