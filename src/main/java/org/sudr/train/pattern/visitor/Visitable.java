package org.sudr.train.pattern.visitor;

//Element interface
public interface Visitable {
	public void accept(Visitor visitor);
}
