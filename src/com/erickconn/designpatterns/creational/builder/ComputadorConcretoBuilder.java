package com.erickconn.designpatterns.creational.builder;

public class ComputadorConcretoBuilder implements ComputadorBuilder{
	private Computador computador;
	
	public ComputadorConcretoBuilder(){
		this.computador = new Computador();
	}
	
	private void reset() { this.computador = new Computador(); }
	@Override
	public void setProcessador(String processador) { this.computador.setProcessador(processador); }
	@Override
	public void setMemoriaRAM(String memoriaRAM) { this.computador.setMemoriaRAM(memoriaRAM); }
	@Override
	public void setSSD(String SSD) { this.computador.setSSD(SSD); }
	@Override
	public void setPlacaVideo(String placaVideo) { this.computador.setPlacaVideo(placaVideo); }

	@Override
	public Computador getResultado() {
		Computador montado = this.computador;
		this.reset();
		return montado;
	}

}
