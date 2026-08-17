package com.erickconn.designpatterns.creational.factorymethod;

public class ProductB implements Product{
	private String name = "Product B";

	@Override
	public void showDetails() {
		System.out.println(name);
		
	}

}
