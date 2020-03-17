package com.rana.beans;

public class PhonePe implements Payment {

	public PhonePe() {
		System.out.println("PhonePe:: 0 param constructor");
	}
	@Override
	final public String payment(int transactionId) {
		return "PhonePe is ready for payment transactionId "+transactionId;
	}

}
