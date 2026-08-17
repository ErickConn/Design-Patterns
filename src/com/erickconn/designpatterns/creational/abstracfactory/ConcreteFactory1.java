package com.erickconn.designpatterns.creational.abstracfactory;

public class ConcreteFactory1 implements AbstractFactory{
	public ProductA1 createProductA() {
		return new ProductA1();
	}
	
	public ProductB1 createProductB() {
		return new ProductB1();
	}
	
}
