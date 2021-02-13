import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Charles Rane", 141367);
    }

    @Test
    public void canGetPilotName(){
        assertEquals("Charles Rane", pilot.getName());
    }

    @Test
    public void canGetLicenseNumber(){
        assertEquals(141367, pilot.getLicenseNumber());
    }


}