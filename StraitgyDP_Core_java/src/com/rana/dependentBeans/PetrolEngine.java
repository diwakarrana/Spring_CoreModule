package com.rana.dependentBeans;

public class PetrolEngine implements Engine {
	@Override
	public void start() {
		System.out.println("PetrolEngine.start()::Petrol Engine");

	}
	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop()::Petrol Engine");
	}
}
