package com.rana.beans;

public class DTDC implements Courier {

	public DTDC() {
		System.out.println("DTDC:: 0 param constructor");
	}
	@Override
	public String deliver(int orderId) {
		return "DTDC is ready for deliver product of orderId"+orderId;
	}

}
