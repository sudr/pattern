package org.sudr.train.pattern.facade;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Provide a unified interface to a set of interfaces in a subsystem. Façade
 * defines a higher-level interface that makes the subsystem easier to use.
 * 
 */
@Test
public class TravelPlannerTest {

	public void test_find_travel_options() {
		HotelBooker hotelBooker = new HotelBooker();
		FlightBooker flightBooker = new FlightBooker();
		TravelPlanner planner = new TravelPlanner(hotelBooker, flightBooker);

		TravelOptions options = planner.findTravelOptions(new Date(), new Date());
		Assert.assertNotNull(options.getHotels());
		Assert.assertNotNull(options.getFlights());
	}
}
