import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HangarTest {

    Hangar hangar;
    Plane plane;

    @Before
    public void before() {
        hangar = new Hangar("A3", Airline.KLM);
    }

    @Test
    public void hasName() {
        assertEquals("A3", hangar.getName());
    }

    @Test
    public void hasAirline() {
        assertEquals(Airline.KLM, hangar.getAirline());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, hangar.planeCount());
    }

    @Test
    public void canAddPlane() {
        hangar.addPlane(plane);
        assertEquals(1, hangar.planeCount());
    }

    @Test
    public void canRemovePlane() {
        hangar.addPlane(plane);
        hangar.remove(plane);
        assertEquals(0, hangar.planeCount());
    }

}
