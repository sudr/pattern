package org.sudr.train.pattern.state;

public class PlayingState implements State {

	public String getId() {
		return "playing";
	}

	public void pressPlay(Mp3PlayerContext context) {
		context.setState(new StandbyState()); 
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (! (obj instanceof PlayingState)) {
			return false;
		}
		PlayingState other = (PlayingState) obj;
		return other.getId().equals(other.getId());
	}
}
