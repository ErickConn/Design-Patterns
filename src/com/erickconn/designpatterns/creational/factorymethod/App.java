package com.erickconn.designpatterns.creational.factorymethod;

public class App {
	public static void main(String args[]) {
		// O cliente trabalha com a abstração (Creator)
        Creator creator = new CreatorA();
        creator.showProductDetails();
        
        // Trocando a fábrica para gerar outro tipo de produto
        creator = new CreatorB();
        creator.showProductDetails();
        
        
	}
}
