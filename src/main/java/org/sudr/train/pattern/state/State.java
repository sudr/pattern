package org.sudr.train.pattern.state;

interface State {

	String getId();

	void pressPlay(Mp3PlayerContext context);

}
