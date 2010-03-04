package org.sudr.train.pattern.observer;

public class MyObserverImpl implements MyObserver {

	private boolean notified;

	public void callback() {
		notified = true;
	}

	public boolean isNotified() {
		return notified;
	}

}
