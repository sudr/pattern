package org.sudr.train.pattern.adapter;

public class Adaptee {

	private boolean called;

	public void method() {
		called = true;
		System.out.println("in adaptee method");
	}

	public boolean isCalled() {
		return called;
	}

}
