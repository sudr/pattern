package org.sudr.train.pattern.factorymethod;

public class XMLLoggerCreator extends AbstractLoggerCreator {

	@Override
	public Logger createLogger() {
		return new XMLLogger();
	}

}
