package org.sudr.train.pattern.observer;

import java.util.Observable;

public class JObservable extends Observable {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		setChanged();
	}
}
