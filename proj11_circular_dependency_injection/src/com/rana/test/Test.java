package com.rana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import com.rana.beans.ClassA;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test.main()");
		
		//creating container...
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\rana\\cnfgs\\ApplicationContext.xml"));
		ClassA a = factory.getBean("aa", ClassA.class);
		System.out.println("....is it working fine....");
	}
}
