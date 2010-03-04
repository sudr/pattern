package org.sudr.train.pattern.adapter;

public class Client {

	private final Adapter adapter;

	public Client(Adapter adapter) {
		this.adapter = adapter;
	}

	public void method() {
		System.out.println("client is calling method on adapter");
		adapter.method();
	}

}
