package com.rana.beans;

import java.util.Date;
public class WishMessageGenerator {
	
	private Date date;
	//setter injection is done here.....
	public void setDate(Date date)
		{
			System.out.println("WishMessageGenerator::setter injection");
			this.date = date;
		}
	//constructor injection is done here...
	public WishMessageGenerator(Date date) {
		System.out.println("WishMessageGenerator::ConstructorInjection");
		this.date = date;
	}
	//in these constructor setter injection will give last effect....
	public String generateWishMsg(String name)
		{   int hour = date.getHours(); 
			if(hour<12)
				return "GM::"+name;
			else if(hour<16)
				return "GAN::"+name;	
			else if(hour <20)
				return "GE::"+name;	
			else 
				return "GN::"+name;		} // end of method
}//end of class
