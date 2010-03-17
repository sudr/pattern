package org.sudr.train.pattern.adapter;

import junit.framework.Assert;

import org.testng.annotations.Test;

@Test
public class AdapterTest {

	public void test() {
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new AdapterImpl(adaptee);
		Client c = new Client(adapter);
		c.method();

		Assert.assertTrue(adaptee.isCalled());
	}

}
