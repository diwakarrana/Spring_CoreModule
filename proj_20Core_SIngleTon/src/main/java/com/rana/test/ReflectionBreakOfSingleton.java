package com.rana.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.rana.singleton.StaticBlockSingleton;

public class ReflectionBreakOfSingleton {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton s2 = null;
		
		
		
		 Constructor<StaticBlockSingleton> constructor = StaticBlockSingleton.class.getDeclaredConstructor();
         constructor.setAccessible(true);
         s2 = (StaticBlockSingleton) constructor.newInstance();
		
		System.out.println(s1.hashCode()+"block<------>"+s2.hashCode());
		
	}
}
