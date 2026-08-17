package com.erickconn.designpatterns.creational.factorymethod;

public class ProductA implements Product{
	private String name = "Product A";
	
	@Override
	public void showDetails() {
		System.out.println(name);
		
	}
	
}
