package org.sudr.train.pattern.state.light;


public interface LightState {

	public enum Light {
		GREEN, YELLOW, RED
	}
	
	Light getLight();
	void change(TrafficLight trafficLight);

}
