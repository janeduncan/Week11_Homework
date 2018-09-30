import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING_767, Airline.KLM);
        flight = new Flight("KLM123", AirportCode.AMS, plane);
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("KLM123", flight.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals(AirportCode.AMS, flight.getDestination());
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void getPlaneCapacity() {
        assertEquals(2, flight.getPlaneCapacity());
    }

    @Test
    public void getTicketCount() {
        assertEquals(0, flight.ticketCount());
    }

}