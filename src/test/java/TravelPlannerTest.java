import java.util.Date;

import org.sudr.train.pattern.facade.FlightBooker;
import org.sudr.train.pattern.facade.HotelBooker;
import org.sudr.train.pattern.facade.TravelOptions;
import org.sudr.train.pattern.facade.TravelPlanner;
import org.testng.Assert;
import org.testng.annotations.Test;

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
