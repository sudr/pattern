package org.sudr.train.pattern.facade;

import java.util.Collection;
import java.util.Date;

/**
 * Facade (simplified) API for HotelBooker and FlightBooker. Downside is
 * sub-systems are wired into the facade. Developers working on the subsystems
 * must be aware that any breaking changes will impact facades around their
 * sub-system.
 * 
 */
public class TravelPlanner {

	private final HotelBooker hotelBooker;
	private final FlightBooker flightBooker;

	public TravelPlanner(HotelBooker hotelBooker, FlightBooker flightBooker) {
		super();
		this.hotelBooker = hotelBooker;
		this.flightBooker = flightBooker;
	}

	public TravelOptions findTravelOptions(Date from, Date to) {
		Collection<Hotel> hotels = hotelBooker.findHotels(from, to);
		Collection<Flight> flights = flightBooker.findFlights(from, to);
		return new TravelOptions(hotels, flights);
	}
}
