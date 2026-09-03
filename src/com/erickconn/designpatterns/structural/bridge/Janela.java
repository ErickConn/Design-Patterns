package com.erickconn.designpatterns.structural.bridge;

public abstract class Janela {
	protected IRenderizadorSO renderizador;
	
	public Janela(IRenderizadorSO renderizador) {
		this.renderizador = renderizador;
	}
	
	public void setRenderizador(IRenderizadorSO renderizador) {
		this.renderizador = renderizador;
	}
	
	public abstract void desenhar();
}
