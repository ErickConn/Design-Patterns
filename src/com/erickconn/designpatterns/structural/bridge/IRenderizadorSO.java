package com.erickconn.designpatterns.structural.bridge;

public interface IRenderizadorSO {
	void desenharBorda(String titulo);
	void desenharConteudo(String texto);
	void desenharBotaoFechar();
}
