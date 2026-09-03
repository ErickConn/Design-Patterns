package com.erickconn.designpatterns.structural.bridge;

public class LinuxRenderer implements IRenderizadorSO{

	@Override
	public void desenharBorda(String titulo) {
		System.out.print("[Linux]" + "---------------------" + titulo + "---------------------");
		
	}

	@Override
	public void desenharConteudo(String texto) {
		System.out.println("[Linux] " + texto);
		
	}

	@Override
	public void desenharBotaoFechar() {
		System.out.println("x");
		
	}

}
