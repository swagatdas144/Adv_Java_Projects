package com.nareshit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.spring.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext apc=new ClassPathXmlApplicationContext("spring.xml");
		Student s1=apc.getBean("s1",Student.class);
		System.out.println(s1);
	}

}
