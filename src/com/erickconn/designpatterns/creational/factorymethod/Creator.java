package com.erickconn.designpatterns.creational.factorymethod;

public abstract class Creator {
	abstract Product createProduct();
	
	public void showProductDetails() {
		Product product = createProduct();
        product.showDetails(); 
	}
	
}
