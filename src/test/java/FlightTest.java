import crew.RankType;
import crew.cabincrew.CabinCrew;
import crew.pilots.Pilot;
import flight.Flight;
import org.junit.Before;
import org.junit.Test;
import passengers.Passenger;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;

public class FlightTest {


    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;
    Pilot pilot1;
    Pilot pilot2;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;

@Before
    public void setUp(){
        flight = new Flight("FL123", "EDI", "INV", "0830");
        pilot1 = new Pilot("Tom Neil", RankType.CAPTAIN, "pilot123");
        pilot2 = new Pilot("Geoff Wellum", RankType.FIRST_OFFICER, "pilot456");
        plane = new Plane(PlaneType.AIRBUS_A380, 3, 1000);
        cabinCrew1 = new CabinCrew("Si Potts", RankType.FLIGHT_ATTENDENT);
        cabinCrew2 = new CabinCrew("Jo Day", RankType.PURSER);
        passenger1 = new Passenger("Bo Diddley", 1);
        passenger2 = new Passenger("Al Green", 2);
        passenger3 = new Passenger("Su Lin", 3);
}


@Test
    public void flightHasFlightNo(){
    assertEquals("FL123", flight.getFlightNo());
}

@Test
    public void flightHasDepartureAirport(){
    assertEquals("EDI", flight.getDepartureAirport());
}

@Test
    public void flightHasDestination(){
    assertEquals("INV", flight.getDestination());
}

@Test
    public void flightHasDepartureTime(){
    assertEquals("0830", flight.getDepartureTime());
}

@Test
    public void passengerListStartsEmpty(){
    assertEquals(0, flight.passengerList());
}

@Test
    public void canAddPassenger(){
    flight.addPassenger(passenger1);
    assertEquals(1, flight.passengerList());
}

@Test
    public void cabinCrewList(){
    flight.addCabinCrew(cabinCrew1);
    flight.addCabinCrew(cabinCrew2);
    assertEquals(2, flight.cabinCrewList());
}

}
