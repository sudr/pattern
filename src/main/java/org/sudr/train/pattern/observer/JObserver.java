package org.sudr.train.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class JObserver implements Observer {

	private boolean notified;

	public void update(Observable o, Object arg) {
		notified = true;
		System.out.println("update called on observer");
	}

	public boolean isNotified() {
		return notified;
	}

}
