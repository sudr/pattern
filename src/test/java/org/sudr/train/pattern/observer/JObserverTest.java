package org.sudr.train.pattern.observer;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class JObserverTest {

	public void test() {
		JObserver o = new JObserver();
		JObservable s = new JObservable();
		s.addObserver(o);
		
		s.setData("hello");
		s.notifyObservers();

		Assert.assertTrue(o.isNotified());
	}

}
