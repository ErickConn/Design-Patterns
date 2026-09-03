package com.erickconn.designpatterns.behavioral.state;

public class Client {
	public static void main(String args[]) {
		MaquinaContext maquina = new MaquinaContext();
		
		maquina.acionarAlavanca(); // Rejeição por falta de crédito
		
		maquina.inserirMoeda();
		maquina.inserirMoeda(); // Rejeição por moeda excedente
		maquina.acionarAlavanca();
		
		// Próxima compra
		maquina.inserirMoeda();
		maquina.acionarAlavanca();
	}
}
