package com.erickconn.designpatterns.behavioral.state;

public class SemMoedaState implements State{

	@Override
	public void inserirMoeda(MaquinaContext maquina) {
		System.out.println("Moeda Aceita");
		maquina.setState(new ComMoedaState());
	}

	@Override
	public void acionarAlavanca(MaquinaContext maquina) {
		System.out.println("Erro: insira uma moeda antes de puxar a alavanca.");
	}

}
