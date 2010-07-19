package org.sudr.train.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.testng.annotations.Test;

/**
 * Provides a way to access the elements of an aggregate object without exposing
 * its underlying represenation.
 * 
 */
@Test
public class TelivisionTest {

	public void returns_first_channel() {
		List<String> channels = new ArrayList<String>();
		Telivision tv = new ConcreteTV(channels);
		channels.add("cnn");
		ChannelIterator it = tv.iterator();
		String currentChannel = it.currentChannel();

		Assert.assertEquals("cnn", currentChannel);
	}

	public void returns_all_channels_going_forward() {
		List<String> channels = new ArrayList<String>();
		Telivision tv = new ConcreteTV(channels);
		channels.add("cnn");
		channels.add("msnbc");
		channels.add("fox");
		ChannelIterator it = tv.iterator();
		int i = 0;
		while (it.hasNext()) {
			String currentChannel = it.currentChannel();
			Assert.assertEquals(channels.get(i), currentChannel);
			i++;
			it.next();
		}
	}

	public void returns_all_channels_going_backwards() {
		List<String> channels = new ArrayList<String>();
		Telivision tv = new ConcreteTV(channels);
		channels.add("cnn");
		channels.add("msnbc");
		channels.add("fox");
		ChannelIterator it = tv.iterator();
		it.setPosition(2);
		int i = 2;
		while (it.hasPrevious()) {
			String currentChannel = it.currentChannel();
			Assert.assertEquals(channels.get(i), currentChannel);
			i--;
			it.previous();
		}
	}
}
