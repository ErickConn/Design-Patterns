package com.erickconn.designpatterns.creational.abstracfactory;

public class ConcreteFactory2 implements AbstractFactory{
	
	public ProductA2 createProductA() {
		return new ProductA2();
	}
	
	public ProductB2 createProductB() {
		return new ProductB2();
	}
	
}