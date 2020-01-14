package com.nagpurit.amol;

import org.springframework.stereotype.Component;

@Component
public class WeatherFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is sunny day";
	}
	

}
