package org.sudr.train.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Provides a way to access the elements of an aggregate object without exposing
 * its underlying represenation.
 * 
 */
@Test
public class TelevisionTest {
	private List<String> channels;
	private Television tv;
	
	@BeforeMethod
	public void setup() {
		channels = new ArrayList<String>();
		channels.add("cnn");
		channels.add("msnbc");
		channels.add("fox");
		tv = new ConcreteTV(channels);
	}
	
	public void returns_first_channel() {
		ChannelIterator it = tv.iterator();
		String currentChannel = it.currentChannel();

		Assert.assertEquals("cnn", currentChannel);
	}

	public void returns_all_channels_going_forward() {
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
	
	public void list_channels() {
		List<String> actualChannels = tv.channels();
		int i = 0;
		for (String c : channels) {
			Assert.assertEquals(actualChannels.get(i), c);
			i++;
		}
	}
}
