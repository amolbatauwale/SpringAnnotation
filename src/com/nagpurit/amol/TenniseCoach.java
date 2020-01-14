package com.nagpurit.amol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TenniseCoach implements Coach{


@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	


//	public TenniseCoach(FortuneService fortuneService) {
//	
//		this.fortuneService = fortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	
	

}
