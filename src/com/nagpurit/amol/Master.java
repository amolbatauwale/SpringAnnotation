package com.nagpurit.amol;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Master {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TenniseCoach tc=context.getBean("tenniseCoach",TenniseCoach.class);
		System.out.println(tc.getDailyWorkout());
		System.out.println(tc.getDailyFortune());
			
		context.close();

	}

}
