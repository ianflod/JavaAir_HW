import crew.RankType;
import crew.cabincrew.CabinCrew;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void setUp(){
        cabinCrew = new CabinCrew("Joe Ross", RankType.FLIGHT_ATTENDENT);
    }

    @Test
    public void hasName(){
        assertEquals("Joe Ross", cabinCrew.getName());
    }

//    @Test
//    public void hasType(){
//        assertEquals(RankType.FLIGHT_ATTENDENT, cabinCrew.getType());
//    }

    @Test
    public void hasType(){
        assertEquals("Flight Attendent", cabinCrew.getStringFromEnum());
    }

    @Test
    public void relayMessage(){
        assertEquals("Welcome to Inverness", cabinCrew.sayMessage());
    }

}
