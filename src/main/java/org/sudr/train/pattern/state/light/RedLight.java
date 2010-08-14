package org.sudr.train.pattern.state.light;

public class RedLight implements LightState {

	public Light getLight() {
		return Light.RED;
	}

	public void change(TrafficLight trafficLight) {
		trafficLight.setState(trafficLight.GREEN_STATE);
	}

}
