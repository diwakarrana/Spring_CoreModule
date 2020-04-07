package com.rana.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rana.beans.EnggCourse;

public class Test {

	public static void main(String[] args) {
	
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		
		reader.loadBeanDefinitions("com/rana/cfgs/ApplicationContext.xml");
		System.out.println("...............parent..........................");
		EnggCourse cou1 = factory.getBean("engcou", EnggCourse.class);
		System.out.println(cou1);
		
		System.out.println("..............child.........................");
		EnggCourse cou2 = factory.getBean("engcouChild", EnggCourse.class);
		System.out.println(cou2);
	}
}
