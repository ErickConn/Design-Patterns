package com.erickconn.designpatterns.structural.bridge;

public class JanelaPadrao extends Janela{

	public JanelaPadrao(IRenderizadorSO renderizador) {
		super(renderizador);
		
	}

	@Override
	public void desenhar() {
		renderizador.desenharBorda("Janela Padrão");
		renderizador.desenharBotaoFechar();
		renderizador.desenharConteudo("Conteúdo da janela");
		
	}

}
