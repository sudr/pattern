package org.sudr.train.pattern.state;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Allows an object to alter its behavior when its internal state changes. The
 * object will appear to change its class.
 */
@Test
public class Mp3PlayerContextTest {

	public void test_transition_from_play_to_standby() {
		Mp3PlayerContext p = new Mp3PlayerContext(new PlayingState());
		p.play();
		Assert.assertEquals(p.getState(), new StandbyState());
	}
	
	public void test_transition_from_standby_to_play() {
		Mp3PlayerContext p = new Mp3PlayerContext(new StandbyState());
		p.play();
		Assert.assertEquals(p.getState(), new PlayingState());
	}
	
	public void test_all_transitions() {
		Mp3PlayerContext p = new Mp3PlayerContext();
		Assert.assertEquals(p.getState(), new StandbyState());
		p.play();
		Assert.assertEquals(p.getState(), new PlayingState());
		p.play();
		Assert.assertEquals(p.getState(), new StandbyState());
	}
	
}
