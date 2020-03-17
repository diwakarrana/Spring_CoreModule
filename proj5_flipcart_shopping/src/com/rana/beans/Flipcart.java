package com.rana.beans;

import java.util.Random;

public class Flipcart {
	
	private Payment payment;
	
	public void setPayment(Payment payment) {
		System.out.println("Flipcart::set dependent payment company");
		this.payment = payment;
	}

	public Flipcart() {
		System.out.println("Flipcart:: 0 param constructor");
		
	}
	
	public String purchase(String[] arr) {
		//generate order id
		Random random = new Random();
		int transactionId = random.nextInt(100000);
		String status = payment.payment(transactionId);
		String items= "";
		for(String s : arr)
			items = " "+items +" "+s+" ";
		return status+" Bill Amount 10000 for "+items;
	}

}
