package com.rana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.rana.beans.WishMessageGenerator;

public class ConstructorInjection {

	public static void main(String[] args) {
BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/com/rana/cnfgs/ApplicationContext.xml"));
		
		WishMessageGenerator generator = (WishMessageGenerator)factory.getBean("wish");
		
		String str = generator.wishMessageGenerator("Diwakar Rana");
		
		System.out.println(str);
	}
}
