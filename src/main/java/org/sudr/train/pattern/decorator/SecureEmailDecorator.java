package org.sudr.train.pattern.decorator;

public class SecureEmailDecorator extends EmailDecorator {

	private String content;

	public SecureEmailDecorator(IEmail email) {
		originalEmail = email;
	}

	public String getContents() {
		content = encrypt(originalEmail.getContents());
		return content;
	}

	private String encrypt(String contents) {
		return "SECURE START\n" + contents + "\nSECURE END";
	}

}
