package org.sudr.train.pattern.strategy.communicate;

public class FaxGateway implements Gateway {

	public void send(String message) {
		System.out.println("fax sent");
	}

}
