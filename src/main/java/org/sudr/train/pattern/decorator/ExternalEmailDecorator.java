package org.sudr.train.pattern.decorator;

public class ExternalEmailDecorator extends EmailDecorator {

	private String content; // instance variable is declared!?

	/**
	 * Contructor is defined in subclass. Defining it in the superclass will
	 * require that it is defined in the subclass.
	 * 
	 * @param email
	 */
	public ExternalEmailDecorator(IEmail email) {
		this.originalEmail = email;
	}

	public String getContents() {
		content = addDisclaimer(originalEmail.getContents());
		return content;
	}

	private String addDisclaimer(String contents) {
		return contents + "\nCompany Disclaimer";
	}

}
