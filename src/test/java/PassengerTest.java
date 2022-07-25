import org.junit.Before;
import org.junit.Test;
import passengers.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void before(){
        passenger1 = new Passenger("John Lennon",0);
        passenger2 = new Passenger("Al Green", 2);

    }

    @Test
    public void passengerHasName(){
        assertEquals("John Lennon", passenger1.getName());
    }

    @Test
    public void passengerNoBags(){
        assertEquals(0, passenger1.bagCount());
    }

    @Test
    public void passengerWithBags(){
        assertEquals(2, passenger2.bagCount());
    }



}
