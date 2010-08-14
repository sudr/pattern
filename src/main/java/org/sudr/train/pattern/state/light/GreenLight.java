package org.sudr.train.pattern.state.light;

public class GreenLight implements LightState {

	public Light getLight() {
		return Light.GREEN;
	}

	public void change(TrafficLight trafficLight) {
		trafficLight.setState(trafficLight.YELLOW_STATE);
	}

}
