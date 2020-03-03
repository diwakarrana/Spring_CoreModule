package com.rana.beans;

import java.util.Date;
public class WishMessageGenerator {
	
	private Date date;
	
	public void setDate(Date date)
		{
			this.date = date;
		}
	
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
