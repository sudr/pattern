package org.sudr.train.pattern.adapter;

import junit.framework.Assert;

import org.testng.annotations.Test;

@Test
public class AdapterTest {

	public void test() {
		Adaptee adaptee = new Adaptee();
		// the adapter is the new interface that the client requires in order to
		// work with the system
		Adapter adapter = new AdapterImpl(adaptee);
		Client c = new Client(adapter);
		c.method();

		Assert.assertTrue(adaptee.isCalled());
	}

}
