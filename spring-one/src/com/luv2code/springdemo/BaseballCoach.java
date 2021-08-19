package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortune;
	
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortune = theFortuneService;
	}
	
//	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting pratice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}
}
