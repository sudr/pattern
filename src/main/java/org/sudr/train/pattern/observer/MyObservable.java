package org.sudr.train.pattern.observer;

public interface MyObservable {

	void attach(MyObserver o);

	void detach(MyObserver o);
	
	void raiseEvent();
}
