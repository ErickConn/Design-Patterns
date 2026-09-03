package com.erickconn.designpatterns.structural.bridge;

public class Client {

	public static void main(String[] args) {
		IRenderizadorSO renderizador = new WindowsRenderer();
		Janela padrao = new JanelaPadrao(renderizador);
		padrao.desenhar();
		renderizador = new LinuxRenderer();
		padrao.setRenderizador(renderizador);
		padrao.desenhar();
	}

}
