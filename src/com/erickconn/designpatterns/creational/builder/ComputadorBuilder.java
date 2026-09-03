package com.erickconn.designpatterns.creational.builder;

public interface ComputadorBuilder {
	void setProcessador(String processador);
	void setMemoriaRAM(String memoriaRAM);
	void setSSD(String SSD);
	void setPlacaVideo(String plavaVideo);
	Computador getResultado();
}
