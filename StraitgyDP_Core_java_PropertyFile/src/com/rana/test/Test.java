package com.rana.test;

import com.rana.factory.VehicalFactory;
import com.rana.targetBean.Vehical;

public class Test {
	
	public static void main(String[] args) {
		Vehical v;
		v = VehicalFactory.getInstance();
		v.journey("Hyd", "Delhi");
	}
}
