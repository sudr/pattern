package org.sudr.train.pattern.proxy;

import java.net.URL;

public class ProxyImage implements Image {
	private final URL url;

	public ProxyImage(URL url) {
		this.url = url;
	}

	// this method delegates to the real image
	public void displayImage() {
		RealImage real = new RealImage(url);
		real.displayImage();
	}

}