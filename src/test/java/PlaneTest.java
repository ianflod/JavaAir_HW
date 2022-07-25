import org.junit.Before;
import org.junit.Test;
import plane.Plane;
import plane.PlaneType;

import static org.junit.Assert.assertEquals;


public class PlaneTest {

    Plane plane;

    @Before
    public void setUp(){
        plane = new Plane(PlaneType.BOEING_787, 2,1000);
    }

    @Test
    public void planeHasType(){
        assertEquals("Boeing 787", plane.getStringFromEnum());
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(2, plane.getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(1000, plane.getWeight());
    }
}
