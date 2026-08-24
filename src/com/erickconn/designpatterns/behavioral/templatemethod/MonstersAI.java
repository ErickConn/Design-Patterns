package com.erickconn.designpatterns.behavioral.templatemethod;

public class MonstersAI extends GameAI {

	@Override
	void buildStructures() {
		
	}

	@Override
	void buildUnits() {
		
	}

	@Override
	void sendScouts(double positionX, double positionY) {
		System.out.printf("[MonstersAI] Enviando batedores para (%.0f, %.0f).%n", positionX, positionY);
	}

	@Override
	void sendWarriors(double positionX, double positionY) {
		System.out.printf("[MonstersAI] Lançando horda de monstros em (%.0f, %.0f).%n", positionX, positionY);
	}
}
