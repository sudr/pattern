package org.sudr.train.pattern.command.shared;

public class EchoResult implements Result {
	private static final long serialVersionUID = 1L;

	private final String message;

	public EchoResult(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
