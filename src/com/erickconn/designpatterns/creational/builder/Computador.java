package com.erickconn.designpatterns.creational.builder;

public class Computador {
	private String processador;
	private String memoriaRAM;
	private String SSD;
	private String placaVideo;
	
	public void setProcessador(String processador) { this.processador = processador; }
	public void setMemoriaRAM(String memoriaRAM) { this.memoriaRAM = memoriaRAM; }
	public void setSSD(String sSD) { SSD = sSD; }
	public void setPlacaVideo(String placaVideo) { this.placaVideo = placaVideo; }
	
	@Override
    public String toString() {
        return "Computador [" +
                "CPU='" + processador + '\'' +
                ", RAM='" + memoriaRAM + '\'' +
                ", Armazenamento='" + SSD + '\'' +
                ", GPU='" + placaVideo + '\'' +
                ']';
    }
	
}
