package com.rana.test;

import java.util.Arrays;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.rana.beans.Set_Map_Properties;
import com.rana.beans.Student;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com\\rana\\cnfgs\\applicationContext.xml"));
		Student student = factory.getBean("st", Student.class);
		System.out.println(student);
		
		Set_Map_Properties smp1 = factory.getBean("smp", Set_Map_Properties.class);
		System.out.println(smp1);
	}
}
