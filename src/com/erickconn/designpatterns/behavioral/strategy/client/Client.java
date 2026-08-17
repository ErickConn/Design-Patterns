package com.erickconn.designpatterns.behavioral.strategy.client;

import com.erickconn.designpatterns.behavioral.strategy.*;

public class Client {
	public static void main(String args[]) {
		Context context = new Context(new WalkStrategy());
        context.showRouteDetails();

        // Alterando a estratégia dinamicamente
        context.setStrategy(new RoadStrategy());
        context.showRouteDetails();
	}
}
