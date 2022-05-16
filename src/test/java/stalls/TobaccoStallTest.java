package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor seventeenYearOLd;
    Visitor eighteenYearOld;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        seventeenYearOLd = new Visitor(17, 200, 20.89);
        eighteenYearOld = new Visitor(18, 185, 50.55);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void allows18YearOld() {
        assertEquals(true, tobaccoStall.isAllowedTo(eighteenYearOld));
    }

    @Test
    public void doesNotAllow17YearOld() {
        assertEquals(false, tobaccoStall.isAllowedTo(seventeenYearOLd));
    }
}
