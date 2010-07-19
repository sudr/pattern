package org.sudr.train.pattern.iterator;

import java.util.List;


public class ConcreteTV implements Telivision {

	private ChannelIterator iterator;

	public ConcreteTV(List<String> channels) {
		iterator = new ConcreteChannelIterator(channels);
	}
	
	public ChannelIterator iterator() {
		return iterator;
	}

}
