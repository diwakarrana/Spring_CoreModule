package com.rana.factory;

import com.rana.dependentBeans.DieselEngine;
import com.rana.dependentBeans.Engine;
import com.rana.dependentBeans.PetrolEngine;
import com.rana.targetBean.Vehical;

public class VehicalFactory {
	static Vehical v1;
	static Engine e;
	public static Vehical getInstance(String type){
		if(type.equalsIgnoreCase("diesel"))
			e =new DieselEngine();
		else if(type.equalsIgnoreCase("petrol"))
			e = new PetrolEngine();
		else {
			throw new IllegalArgumentException("Invalid parameter type");
		}
		
		v1 = new Vehical();
		v1.setE(e);
		return v1;
	}
}
