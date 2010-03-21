package org.sudr.train.pattern.singleton;

public class Singleton {

	public static class LazyHolder {
		public static Singleton instance = new Singleton();
	}

	private Singleton() {
	}

	/*public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}*/

	public static Singleton getInstance() {
		return LazyHolder.instance;
	}

}