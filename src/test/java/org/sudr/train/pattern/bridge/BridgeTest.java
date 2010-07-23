package org.sudr.train.pattern.bridge;

import org.testng.annotations.Test;

/**
 * Decouple an abstraction from its implementation so that the two can vary
 * independently.
 * 
 */
@Test
public class BridgeTest {

	public void test_remote() {
		TV tv = new Sony();
		// we need a specifc kind of remote (plus/minnus)
		PlusMinusRemote remote = new PlusMinusRemote(tv);
		remote.nextChannel();
	}
}
