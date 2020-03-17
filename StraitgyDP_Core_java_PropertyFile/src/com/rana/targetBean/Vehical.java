package com.rana.targetBean;

import com.rana.dependentBeans.Engine;

public class Vehical {
	Engine e ;
	public Vehical() {
		System.out.println("Vehical.Vehical():: 0 param constructor");
		}
	
		public void setE(Engine e) {
			this.e = e;
		}
		
		public void journey(String source, String dest) {
			e.start();
			System.out.println("journey started from from "+source);
			e.stop();
			System.out.println("journey ended at "+dest);
		}
}
