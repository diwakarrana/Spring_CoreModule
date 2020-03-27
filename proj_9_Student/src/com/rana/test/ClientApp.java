package com.rana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.rana.controller.StudentController;

public class ClientApp {

	public static void main(String[] args) {
		//create IOC container........
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\rana\\cfgs\\ApplicationContext.xml"));
		
		//get target beans.....
		
		StudentController controller = factory.getBean("stController", StudentController.class);
		
		//call method.....
		try {
			System.out.println(controller.process("200", "Ganesh", "75", "66", "94"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
