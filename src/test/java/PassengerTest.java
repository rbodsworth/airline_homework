import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("John Cutter", 1);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("John Cutter", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(1, passenger.getNumberOfBags());
    }


}
