package com.erickconn.designpatterns.behavioral.templatemethod;

public abstract class GameAI {

	// Template Method: define o esqueleto do algoritmo.
	// As subclasses não podem alterar esta ordem.
	final void takeTurn() {
		collectResources();
		buildStructures();
		buildUnits();
		attack();
	}

	// Passo concreto compartilhado entre todas as IAs.
	void collectResources() {
		System.out.println("[" + getClass().getSimpleName() + "] Coletando recursos dos edifícios.");
	}

	// Passos abstratos: cada subclasse define sua própria estratégia.
	abstract void buildStructures();

	abstract void buildUnits();

	void attack() {
		if (Math.random() < 0.5) {
			sendScouts(0, 0);
		} else {
			sendWarriors(0, 0);
		}
	}

	abstract void sendScouts(double positionX, double positionY);

	abstract void sendWarriors(double positionX, double positionY);
}
