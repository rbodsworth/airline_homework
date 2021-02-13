import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember1;

    @Before
    public void before(){
        cabinCrewMember1 = new CabinCrewMember("Sabrina Ritchie", CrewRank.CAPTAIN.PURSER);
    }

    @Test
    public void hasName(){
        assertEquals("Sabrina Ritchie", cabinCrewMember1.getName());
    }}