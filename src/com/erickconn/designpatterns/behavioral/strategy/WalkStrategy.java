package com.erickconn.designpatterns.behavioral.strategy;

public class WalkStrategy implements Strategy{
	private int price = 0;
	private int time = 10;
	
	@Override
	public void execute() {
		System.out.println("Walk strategy: price -  " + price + " time - " + time);		
	}

}
