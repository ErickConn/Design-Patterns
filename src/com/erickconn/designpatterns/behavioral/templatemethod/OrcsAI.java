package com.erickconn.designpatterns.behavioral.templatemethod;

public class OrcsAI extends GameAI {

	@Override
	void buildStructures() {
		System.out.println("[OrcsAI] Construindo fortalezas e barracas.");
	}

	@Override
	void buildUnits() {
		System.out.println("[OrcsAI] Recrutando guerreiros e berserkers.");
	}

	@Override
	void sendScouts(double positionX, double positionY) {
		System.out.printf("[OrcsAI] Enviando lobos batedores para (%.0f, %.0f).%n", positionX, positionY);
	}

	@Override
	void sendWarriors(double positionX, double positionY) {
		System.out.printf("[OrcsAI] Marchando exército Orc em direção a (%.0f, %.0f).%n", positionX, positionY);
	}
}
