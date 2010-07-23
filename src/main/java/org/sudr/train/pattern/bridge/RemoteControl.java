package org.sudr.train.pattern.bridge;

/**
 * This is the abstraction that delegates to the tv.
 *
 */
public abstract class RemoteControl {

	private final TV tv;

	public RemoteControl(TV tv) {
		this.tv = tv;
	}
	
	public void setChannel(int channel) {
		tv.tuneChannel(channel);
	}

}
