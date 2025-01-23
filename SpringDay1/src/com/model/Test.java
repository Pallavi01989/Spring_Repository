package com.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

     BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/model/bean.xml");
     

	}

}
