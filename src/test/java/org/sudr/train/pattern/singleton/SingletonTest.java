package org.sudr.train.pattern.singleton;

import junit.framework.Assert;

import org.testng.annotations.Test;

/**
 * Ensure a class has only one instance and provide a global point of access to
 * it.
 * 
 */
@Test
public class SingletonTest {

	public void test_get_instance() {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();

		Assert.assertTrue("Singleton instances must be the same", instance1 == instance2);
	}
}
