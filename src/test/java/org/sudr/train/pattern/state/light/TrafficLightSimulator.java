package org.sudr.train.pattern.state.light;

import org.sudr.train.pattern.state.light.LightState.Light;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TrafficLightSimulator {

	@Test
	public void LightShouldBeGreen() {
		TrafficLight light = new TrafficLight();
		Assert.assertEquals(Light.GREEN, light.state());
	}

	@Test
	public void LightShouldChangeToYellowFromGreen() {
		TrafficLight light = new TrafficLight();
		light.change();
		Assert.assertEquals(Light.YELLOW, light.state());
	}

	@Test
	public void LightShouldChangeToRedFromYellow() {
		TrafficLight light = new TrafficLight();
		light.setState(light.YELLOW_STATE);
		light.change();
		Assert.assertEquals(Light.RED, light.state());
	}

}
