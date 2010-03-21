package org.sudr.train.pattern.decorator;

import junit.framework.Assert;

import org.testng.annotations.Test;

/**
 * Allows for the dynamic wrapping of objects in order to modify their existing
 * responsibilities and behaviours.
 * 
 */
@Test
public class DecoratorTest {

	public void test_external_email_decorator() {
		IEmail originalEmail = new Email("email content");
		IEmail email = new ExternalEmailDecorator(originalEmail);
		Assert.assertTrue("External email must contain company disclaimer", email.getContents().endsWith("Company Disclaimer"));
	}

	public void test_secure_email_decorator() {
		IEmail originalEmail = new Email("email content");
		IEmail email = new SecureEmailDecorator(originalEmail);
		Assert.assertTrue("Secure email must start with secure", email.getContents().startsWith("SECURE START"));
		Assert.assertTrue("Secure email must end with secure", email.getContents().endsWith("SECURE END"));
	}

	/**
	 * Chaining decorators
	 */
	public void test_secure_external_email_decorator() {
		IEmail originalEmail = new Email("email content");
		IEmail email = new SecureEmailDecorator(new ExternalEmailDecorator(originalEmail));
		Assert.assertTrue("Secure email must start with secure", email.getContents().startsWith("SECURE START"));
		Assert.assertTrue("Secure email must end with secure", email.getContents().endsWith("SECURE END"));
		Assert.assertTrue("External email must contain company disclaimer", email.getContents().contains("Company Disclaimer"));
	}
}
