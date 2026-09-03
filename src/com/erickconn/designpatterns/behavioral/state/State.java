package com.erickconn.designpatterns.behavioral.state;

public interface State {
	void inserirMoeda(MaquinaContext maquina);
	void acionarAlavanca(MaquinaContext maquina);
}
