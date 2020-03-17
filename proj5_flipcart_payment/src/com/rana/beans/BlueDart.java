package com.rana.beans;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("DTDC:: 0 param constructor");
	}
	@Override
	public String deliver(int orderId) {
		return "BlueDart is ready for deliver product of orderId"+orderId;
	}

}
