package com.rana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.rana.beans.Student;

public class Test {

	public static void main(String[] args) {
	BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/rana/cfgs/ApplicationContext.xml"));
	Student st = factory.getBean("st",Student.class);
	System.out.println(st.toString());
	System.out.println("yes it is working fine");
	}
}
