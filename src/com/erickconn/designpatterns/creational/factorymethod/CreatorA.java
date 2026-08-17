package com.erickconn.designpatterns.creational.factorymethod;

public class CreatorA extends Creator{

	@Override
	public Product createProduct() {
		return new ProductA();
	}

}
