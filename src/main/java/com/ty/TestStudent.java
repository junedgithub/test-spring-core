package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_bean_conf.xml");
    Student student = (Student) applicationContext.getBean("myStudent");
    student.run();
	}
}
