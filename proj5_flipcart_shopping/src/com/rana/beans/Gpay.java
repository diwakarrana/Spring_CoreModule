package com.rana.beans;

public class Gpay implements Payment {

	public Gpay() {
		System.out.println("Gpay:: 0 param constructor");
	}
	@Override
	final public String payment(int transactionId) {
		return "Gpay is ready for payment transactionId "+transactionId;
	}

}
