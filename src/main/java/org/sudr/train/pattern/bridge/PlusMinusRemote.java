package org.sudr.train.pattern.bridge;

/**
 * This is our refined abstraction when we want a plus minus remote.
 * 
 */
public class PlusMinusRemote extends RemoteControl {

	public PlusMinusRemote(TV tv) {
		super(tv);
	}

	private int currentChannel = 1;

	public void nextChannel() {
		currentChannel++;
		setChannel(currentChannel);
	}

	public void prevChannel() {
		currentChannel--;
		setChannel(currentChannel);
	}

}
