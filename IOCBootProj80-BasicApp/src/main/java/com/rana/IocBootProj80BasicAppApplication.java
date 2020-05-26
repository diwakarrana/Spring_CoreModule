package com.rana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.rana.beans.WishMessageGenerator;

@SpringBootApplication
public class IocBootProj80BasicAppApplication {

	public static void main(String[] args) {
		System.out.println("IocBootProj80BasicAppApplication.main()");
		// get instance of IOC container
		ApplicationContext ctx = null;
		WishMessageGenerator wmg = null;
		String msg = null;
		ctx = SpringApplication.run(IocBootProj80BasicAppApplication.class, args);
		// get instance class name. class that Implement ApplicationContext and here is used 
		System.out.println(ctx.getClass());
		wmg = ctx.getBean("wmg", WishMessageGenerator.class);
		msg = wmg.generateWishMessage("Diwakar Rana");
		System.out.println("Result is "+msg);
		//....................close container.................
		
		((ConfigurableApplicationContext) ctx).close();
		
	}
}
