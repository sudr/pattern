package org.sudr.train.pattern.observer;

import java.util.ArrayList;
import java.util.Collection;

public class MyObservableImpl implements MyObservable {

	private final Collection<MyObserver> listeners = new ArrayList<MyObserver>();

	public void attach(MyObserver o) {
		listeners.add(o);
	}

	public void detach(MyObserver o) {
		listeners.remove(o);
	}

	public void raiseEvent() {
		for (MyObserver o : listeners) {
			o.callback();
		}
	}

}
