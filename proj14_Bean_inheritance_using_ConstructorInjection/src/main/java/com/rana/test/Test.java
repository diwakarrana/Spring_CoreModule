package com.rana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.rana.beans.Car;

public class Test {

	public static void main(String[] args) {
		
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com//rana//cfgs//ApplicationContext.xml"));
	Car c1 =factory.getBean("rajacar", Car.class);
	Car c2 =factory.getBean("ranicar", Car.class);
	System.out.println(c1);
	System.out.println(c2);
	}

}
