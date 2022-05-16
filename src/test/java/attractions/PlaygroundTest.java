package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor fifteenYearOld;
    Visitor sixteenYearOLd;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        fifteenYearOld = new Visitor(15, 165, 10.8);
        sixteenYearOLd = new Visitor(16, 170, 12.95);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void allows15YearOld() {
        assertEquals(true, playground.isAllowedTo(fifteenYearOld));
    }

    @Test
    public void doesNotAllow16YearOld() {
        assertEquals(false, playground.isAllowedTo(sixteenYearOLd));
    }
}
