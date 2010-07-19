package org.sudr.train.pattern.iterator;

import java.util.List;

public interface Television {

	ChannelIterator iterator();
	List<String> channels();
}
