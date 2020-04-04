package com.rana.beans;

public class Car {
	private Integer carNo;
	private String  model;
	private String  owner;
	private String  color;
	private String fuelType;
	private float price;
	
	
	public Car(Integer carNo, String model, String owner, String color, String fuelType, float price) {
		System.out.println("Car::six param constructor...");
		this.carNo = carNo;
		this.model = model;
		this.owner = owner;
		this.color = color;
		this.fuelType = fuelType;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", model=" + model + ", owner=" + owner + ", color=" + color + ", fuelType="
				+ fuelType + ", price=" + price + "]";
	}
	
	
	
}//end of class
