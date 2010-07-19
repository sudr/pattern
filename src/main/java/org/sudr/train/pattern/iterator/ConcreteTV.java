package org.sudr.train.pattern.iterator;

import java.util.List;


public class ConcreteTV implements Television {

	private ChannelIterator iterator;
	private List<String> channels;

	public ConcreteTV(List<String> channels) {
		this.channels = channels;
		iterator = new ConcreteChannelIterator(channels);
	}
	
	public ChannelIterator iterator() {
		return iterator;
	}
	
	public List<String> channels() {
		return channels;
	}

}
