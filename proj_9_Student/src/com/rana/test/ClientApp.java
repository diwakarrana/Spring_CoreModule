package com.rana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.rana.controller.StudentController;

public class ClientApp {

	public static void main(String[] args) {
		//create IOC container........
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/rana/cfgs/ApplicationContext.xml"));
		
		//get target beans.....
		
		StudentController controller = factory.getBean("stController", StudentController.class);
		
		//call method.....
		System.out.println(controller.process("100", "Diwakar Rana", "94", "94", "88"));
	}
}
