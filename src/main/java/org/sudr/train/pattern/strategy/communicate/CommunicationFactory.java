package org.sudr.train.pattern.strategy.communicate;


public class CommunicationFactory {

	public enum CommunicationServiceType {
		EMAIL, FAX
	}

	public static CommunicationService service(CommunicationServiceType type) {
		switch (type) {
		case EMAIL:
			return new CommunicationSerivceImpl(new EmailGateway());
		case FAX:
			return new CommunicationSerivceImpl(new FaxGateway());
		default:
			break;
		}
		throw new RuntimeException("Unknown communication service type requested " + type);
	}

}
