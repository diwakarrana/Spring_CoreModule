package com.rana.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.rana.controller.StudentController;

public class ClientApp {

	public static void main(String[] args) {
		String sno, name, m1, m2, m3;
		//create IOC container........
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter sno");
		sno = scan.next();
		
		System.out.println("Enter name");
		name = scan.next();
		
		System.out.println("Enter m1");
		m1 = scan.next();
		
		System.out.println("Enter m2");
		m2 = scan.next();
		
		System.out.println("Enter m3");
		m3 = scan.next();
		
		
		
		System.out.println();
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\rana\\cfgs\\ApplicationContext.xml"));
		
		//get target beans.....
		
		StudentController controller = factory.getBean("stController", StudentController.class);
		
		//call method.....
		try {
			System.out.println(controller.process(sno, name, m1, m2, m3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
