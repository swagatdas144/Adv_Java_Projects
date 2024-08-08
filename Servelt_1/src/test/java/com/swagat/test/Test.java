package com.swagat.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swagat.spring.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext apx=new ClassPathXmlApplicationContext("spring.xml");
			Student s2=(Student) apx.getBean("s2");
			System.out.println(s2);
			Student s3=(Student) apx.getBean("s1");
			System.out.println(s3);
			
	}

}