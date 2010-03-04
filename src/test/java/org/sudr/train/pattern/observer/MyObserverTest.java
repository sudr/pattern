package org.sudr.train.pattern.observer;

import org.testng.Assert;
import org.testng.annotations.Test;

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
