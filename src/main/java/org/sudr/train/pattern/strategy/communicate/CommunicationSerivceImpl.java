package org.sudr.train.pattern.strategy.communicate;

public class CommunicationSerivceImpl implements CommunicationService {

	private Gateway gateway;

	public CommunicationSerivceImpl(Gateway gateway) {
		this.gateway = gateway;
	}

	public void send(String message) {
		gateway.send(message);
	}

}
