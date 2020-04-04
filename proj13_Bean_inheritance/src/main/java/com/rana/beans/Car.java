package com.rana.beans;

public class Car {
	private Integer carNo;
	private String  model;
	private String  owner;
	private String  color;
	private String fuelType;
	private float price;
	
	public Car() {
		System.out.println("Car:: 0 param constructor");
	}

	public Integer getCarNo() {
		return carNo;
	}

	public void setCarNo(Integer carNo) {
		this.carNo = carNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", model=" + model + ", owner=" + owner + ", color=" + color + ", fuelType="
				+ fuelType + ", price=" + price + "]";
	}
}//end of class
