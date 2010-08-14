package org.sudr.train.pattern.state.light;

import org.sudr.train.pattern.state.light.LightState.Light;

public class TrafficLight {

	public final LightState GREEN_STATE = new GreenLight();
	public final LightState YELLOW_STATE = new YellowLight();
	public final LightState RED_STATE = new RedLight();

	private LightState state = GREEN_STATE;
	
	public Light state() {
		return state.getLight();
	}

	public void change() {
		state.change(this);
	}

	public void setState(LightState state) {
		this.state = state;
	}

}
