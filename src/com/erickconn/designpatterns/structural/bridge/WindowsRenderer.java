package com.erickconn.designpatterns.structural.bridge;

public class WindowsRenderer implements IRenderizadorSO{

	@Override
	public void desenharBorda(String titulo) {
		System.out.print("[Windows] ============" + titulo + "============");
		
	}

	@Override
	public void desenharConteudo(String texto) {
		System.out.println("[Windows] " + texto);
		
	}

	@Override
	public void desenharBotaoFechar() {
		System.out.println("X");
		
	}
	
}
