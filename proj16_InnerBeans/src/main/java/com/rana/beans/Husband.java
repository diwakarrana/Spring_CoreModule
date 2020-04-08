package com.rana.beans;

public class Husband {
	
	private Wife wife;

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	public void husband() {
		System.out.println("my wife name is following");
		System.out.println(wife.wifeName());
	}
	
}
