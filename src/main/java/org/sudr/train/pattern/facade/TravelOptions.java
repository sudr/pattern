package org.sudr.train.pattern.facade;

import java.util.Collection;

public class TravelOptions {

	private final Collection<Hotel> hotels;
	private final Collection<Flight> flights;

	public TravelOptions(Collection<Hotel> hotels, Collection<Flight> flights) {
		this.hotels = hotels;
		this.flights = flights;
	}

	public Collection<Hotel> getHotels() {
		return hotels;
	}

	public Collection<Flight> getFlights() {
		return flights;
	}
}
