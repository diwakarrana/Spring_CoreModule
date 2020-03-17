package com.rana.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.rana.dependentBeans.Engine;
import com.rana.targetBean.Vehical;

public class VehicalFactory {
	static Vehical v;
	static InputStream is;
	static Properties p;
	static Engine e;
	static {
		
		try {
			is = new FileInputStream("src//com//rana//commons//app.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//...............................................................
		p = new Properties();
		try {
			p.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// static block
	
	
	public static Vehical getInstance() {
		 try {
			v =(Vehical)Class.forName(p.getProperty("target.class")).newInstance();
			e = (Engine)Class.forName(p.getProperty("dependent.class")).newInstance();
			v.setE(e);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return v;
	}
}
