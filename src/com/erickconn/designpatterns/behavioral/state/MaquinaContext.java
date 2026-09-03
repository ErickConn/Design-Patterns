package com.erickconn.designpatterns.behavioral.state;

public class MaquinaContext {
	private State state = new SemMoedaState();
	
	public void setState(State novoEstado) { this.state = novoEstado; }
	
	public void inserirMoeda() { state.inserirMoeda(this); }
	
	public void acionarAlavanca() { state.acionarAlavanca(this); }
	
}
