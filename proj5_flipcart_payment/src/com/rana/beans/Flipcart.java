package com.rana.beans;

import java.util.Random;

public class Flipcart {
	
	private Courier courier;
	
	public void setCourier(Courier courier) {
		System.out.println("Flipcart::set dependent courier");
		this.courier = courier;
	}

	public Flipcart() {
		System.out.println("Flipcart:: 0 param constructor");
		
	}
	
	public String purchase(String[] arr) {
		//generate order id
		Random random = new Random();
		int orderId = random.nextInt(100000);
		String status = courier.deliver(orderId);
		String items= "";
		for(String s : arr)
			items = " "+items +" "+s+" ";
		return status+"Bill Amount 10000 for"+items;
	}

}
