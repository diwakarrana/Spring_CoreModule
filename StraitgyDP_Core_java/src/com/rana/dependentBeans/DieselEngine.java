package com.rana.dependentBeans;

public class DieselEngine implements Engine {

	@Override
	public void start() {
		System.out.println("DieselEngine.start():: Diesel Engine");
	}

	@Override
	public void stop() {
		System.out.println("DieselEngine.stop()::Diesel Engine");
	}
}
