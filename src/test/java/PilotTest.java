import crew.RankType;
import crew.pilots.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Tom Neil", RankType.CAPTAIN, "pilot123");
    }

    @Test
    public void hasName(){
        assertEquals("Tom Neil", pilot.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Captain", pilot.getStringFromEnum());
    }

    @Test
    public void hasLicence(){
        assertEquals("pilot123", pilot.getLicence());
    }

    @Test
    public void flyThePlane(){
        assertEquals("ZZoooomm", pilot.flyPlane());
    }
}
