package com.erickconn.designpatterns.behavioral.state;

public class ComMoedaState implements State{

	@Override
	public void inserirMoeda(MaquinaContext maquina) {
		System.out.println("Aviso: já há um crédito ativo. Puxe a alavanca.");		
	}

	@Override
	public void acionarAlavanca(MaquinaContext maquina) {
		System.out.println("Sucesso: produto liberado na bandeja!");
        maquina.setState(new SemMoedaState());
	}

}
