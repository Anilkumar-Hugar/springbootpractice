package com.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		BeanFactory resource = new ClassPathXmlApplicationContext("bean.xml");
		Bean bean = resource.getBean("bean", Bean.class);
		Bean bean2 = resource.getBean("details", Bean.class);
		System.out.println(bean2.getMsg());
		System.out.println(bean.getMsg());
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Bean bean3 = context.getBean("bean2", Bean.class);
		System.out.println("printing using application context");
		System.out.println(bean3.getMsg());
	}
}