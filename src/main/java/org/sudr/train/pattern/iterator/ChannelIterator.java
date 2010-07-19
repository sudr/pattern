package org.sudr.train.pattern.iterator;

public interface ChannelIterator {

	boolean hasNext();
	void next();
	String currentChannel();
	boolean hasPrevious();
	void previous();
	void setPosition(int position);
	
}
