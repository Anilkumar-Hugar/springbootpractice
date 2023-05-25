package com.bean;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
	@Test
	public void beanTest() {
		BeanFactory factory=new ClassPathXmlApplicationContext("bean.xml");
		//Bean bean=factory.getBean("bean",Bean.class);
		assertEquals(true,Bean.postConstruct());
	}
	@Test
	public void beanTest2() {
		ApplicationContext  context=new ClassPathXmlApplicationContext("bean.xml");
		Bean bean2=context.getBean("bean2",Bean.class);
		assertEquals(true, bean2.postConstruct());
	}
}
