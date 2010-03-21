package org.sudr.train.pattern.observer;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Define a one-to-many dependency between objects so that when one object
 * changes state, all its dependents are notified and updated automatically.
 * 
 */
@Test
public class MyObserverTest {

	public void test() {
		MyObserver o = new MyObserverImpl();
		MyObservable s = new MyObservableImpl();
		s.attach(o);
		s.raiseEvent();

		Assert.assertTrue(o.isNotified());
	}

}
