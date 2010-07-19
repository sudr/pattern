package org.sudr.train.pattern.iterator;

import java.util.List;

public class ConcreteChannelIterator implements ChannelIterator {

	private final List<String> channels;
	private int currentPos;

	public ConcreteChannelIterator(List<String> channels) {
		this.channels = channels;
	}

	public boolean hasNext() {
		return (currentPos + 1 < channels.size());
	}

	public void next() {
		currentPos++;
	}

	public String currentChannel() {
		return channels.get(currentPos);
	}

	public boolean hasPrevious() {
		return currentPos - 1 > -1;
	}

	public void previous() {
		currentPos--;
	}

	public void setPosition(int position) {
		currentPos = position;
	}

}
