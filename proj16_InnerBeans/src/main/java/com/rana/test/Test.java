package com.rana.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.rana.beans.Husband;

public class Test {

	public static void main(String[] args) {
		
		BeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) factory);
		reader.loadBeanDefinitions("com/rana/cfgs/ApplicationContext.xml");
		Husband hus = factory.getBean("h", Husband.class);
        hus.husband();		
	}
}
