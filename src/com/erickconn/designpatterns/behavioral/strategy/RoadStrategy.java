package com.erickconn.designpatterns.behavioral.strategy;

public class RoadStrategy implements Strategy{
	private double price = 10.0;
	private int time = 2;

	@Override
	public void execute() {
		System.out.println("Road strategy: price -  " + price + "time - " + time);		
	}
	
}
