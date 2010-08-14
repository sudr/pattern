package org.sudr.train.pattern.state.light;

public class YellowLight implements LightState {

	public Light getLight() {
		return Light.YELLOW;
	}

	public void change(TrafficLight trafficLight) {
		trafficLight.setState(trafficLight.RED_STATE);
	}

}
