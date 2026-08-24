package com.erickconn.designpatterns.behavioral.templatemethod;

public class Client {
	public static void main(String args[]) {
		GameAI npc = new OrcsAI();
		npc.takeTurn();
		
		npc = new MonstersAI();
		npc.takeTurn();
	}
}
