import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger;


    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING_767, Airline.KLM);
        passenger = new Passenger("Jane Duncan");
    }

    @Test
    public void hasPlaneType() {
        assertEquals(PlaneType.BOEING_767, plane.getPlaneType());
    }

    @Test
    public void hasAirline() {
        assertEquals(Airline.KLM, plane.getAirline());
    }

    @Test
    public void startsEmpty() {
        assertEquals(0, plane.passengerCount());
    }

    @Test
    public void canAddPassenger() {
        plane.addPassenger(passenger);
        assertEquals(1, plane.passengerCount());
    }

}
