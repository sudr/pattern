package org.sudr.train.pattern.adapter;

public class AdapterImpl implements Adapter {

	private final Adaptee adaptee;

	public AdapterImpl(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void method() {
		System.out.println("Adapter is calling method on adaptee");
		adaptee.method();
	}

}
