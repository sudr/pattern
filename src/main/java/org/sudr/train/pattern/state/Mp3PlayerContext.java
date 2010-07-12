package org.sudr.train.pattern.state;

public class Mp3PlayerContext {

	private State state;

	public Mp3PlayerContext(State state) {
		this.state = state;
	}

	public Mp3PlayerContext() {
		state = new StandbyState();
	}

	public void play() {
		state.pressPlay(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
