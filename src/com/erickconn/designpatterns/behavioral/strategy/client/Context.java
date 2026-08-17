package com.erickconn.designpatterns.behavioral.strategy.client;
import com.erickconn.designpatterns.behavioral.strategy.Strategy;

public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
        this.strategy = strategy;
    }
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void showRouteDetails() {
		strategy.execute();
	}
}
