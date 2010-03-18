package org.sudr.train.pattern.decorator;

public class Email implements IEmail {

	private final String content;

	public Email(String content) {
		super();
		this.content = content;
	}

	public String getContents() {
		return content;
	}

}
