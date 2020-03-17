package com.rana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.rana.beans.Flipcart;

public class TestApp {

	public static void main(String[] args) {
	
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/rana/cfgs/ApplicationContext.xml"));
		Flipcart f = factory.getBean("fkt", Flipcart.class);
		String res = f.purchase(new String[] {"charger","mobile"});
		System.out.println(res);
	}
}
