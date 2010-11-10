package org.sudr.train.pattern.template;

public class Person implements Comparable<Person> {

	private String name;

	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

	public int compareTo(Person o) {
		return name.compareTo(o.name);
	}
	
}
