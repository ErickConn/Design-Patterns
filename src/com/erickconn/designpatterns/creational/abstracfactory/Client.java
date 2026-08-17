package com.erickconn.designpatterns.creational.abstracfactory;

public class Client {
	private AbstractFactory factory;
	
	public Client(AbstractFactory factory) {
		this.factory = factory;
	}
	
	public void execute() {
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

        productA.showProductADetails();
        productB.showProductBDetails();
    }

	
	public static void main(String args[]) {
		Client c = new Client(new ConcreteFactory1());
		c.execute();
		
		c = new Client(new ConcreteFactory2());
		c.execute();
	
	}
	
}
