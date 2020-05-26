package com.rana.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name = "cal")
	public Calendar createCalender() {
		System.out.println("AppConfig.createCalender()");
		Calendar cal = null;
		cal = Calendar.getInstance();
		return cal;
	}

}
