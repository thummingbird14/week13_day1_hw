package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor tenYearOld;
    Visitor tallTenYearOld;
    Visitor shortThirteenYearOld;
    Visitor tallThirteenYearOld;

    @Before
    public void setUp() {

        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tenYearOld = new Visitor(10, 140, 3.85);
        tallTenYearOld = new Visitor(10, 150, 10.60);
        shortThirteenYearOld = new Visitor(13, 130, 15.00);
        tallThirteenYearOld = new Visitor(13, 155, 20.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void rejects10YearOld() {
        assertEquals(false, rollerCoaster.isAllowedTo(tenYearOld));
    }

    @Test
    public void rejectsTall10YearOld() {
        assertEquals(false, rollerCoaster.isAllowedTo(tallTenYearOld));
    }

    @Test
    public void rejectsShort13YearOld() {
        assertEquals(false, rollerCoaster.isAllowedTo(shortThirteenYearOld));
    }

    @Test
    public void allowsTall13YearOld() {
        assertEquals(true, rollerCoaster.isAllowedTo(tallThirteenYearOld));
    }
}
