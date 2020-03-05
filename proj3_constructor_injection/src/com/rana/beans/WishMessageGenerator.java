package com.rana.beans;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	//single parameter constructor........
	public WishMessageGenerator(Date date) {
		this.date = date;
	}
	
	public String wishMessageGenerator(String user) {
		int hour = date.getHours();
		if(hour<12)
			return "GM::"+user;
		else if(hour<16)
			return "GAN::"+user;
		else if(hour<20)
			return "GE::"+user;
		else 
			return "GN::"+user;
	}//end of main method
}//end of class
