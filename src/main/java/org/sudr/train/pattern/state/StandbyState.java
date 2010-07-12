package org.sudr.train.pattern.state;

public class StandbyState implements State {

	public String getId() {
		return "standby";
	}

	public void pressPlay(Mp3PlayerContext context) {
		context.setState(new PlayingState());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (! (obj instanceof StandbyState)) {
			return false;
		}
		StandbyState other = (StandbyState) obj;
		return other.getId().equals(other.getId());
	}

}
