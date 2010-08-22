package org.sudr.train.pattern.strategy.communicate;

public class EmailGateway implements Gateway {

	public void send(String message) {
		System.out.println("email sent");
	}

}
