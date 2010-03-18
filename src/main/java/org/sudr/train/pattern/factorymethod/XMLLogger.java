package org.sudr.train.pattern.factorymethod;

public class XMLLogger implements Logger {

	public void log(String message) {
		System.err.println("logging");
	}

}
