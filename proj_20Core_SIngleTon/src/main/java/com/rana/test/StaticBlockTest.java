package com.rana.test;

import com.rana.singleton.StaticBlockSingleton;

public class StaticBlockTest {

	public static void main(String[] args) {
		
		StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
		
		System.out.println(s1.hashCode()+"block<------>"+s2.hashCode());
		
	}
}
