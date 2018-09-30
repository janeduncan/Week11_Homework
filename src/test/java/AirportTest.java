import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport airport;
    Plane plane;
    Flight flight;
    Hangar hangar;

    @Before
    public void before() {
        airport = new Airport(AirportCode.GLA);
        plane = new Plane(PlaneType.BOEING_767, Airline.KLM);
        flight = new Flight("KLM123", AirportCode.AMS, plane);
        hangar = new Hangar("A3", Airline.KLM);
    }

    @Test
    public void canGetAirportCode() {
        assertEquals(AirportCode.GLA, airport.getAirportCode());
    }

    @Test
    public void flightsStartsEmpty() {
        assertEquals(0, airport.flightCount());
    }

    @Test
    public void hangarsStartsEmpty() {
        assertEquals(0, airport.hangarCount());
    }

    @Test
    public void canAddFlight() {
        airport.addFlight(flight);
        assertEquals(1, airport.flightCount());
    }

    @Test
    public void canAddHangar() {
        airport.addHangar(hangar);
        assertEquals(1, airport.hangarCount());
    }

    @Test
    public void canCountPassengers() {
        flight.sellTicket();
        flight.sellTicket();
        assertEquals(2, airport.totalPassengersOnFlight(flight));
    }

    @Test
    public void canCreateFlight() {
        airport.createFlight("KLM123", AirportCode.AMS, plane);
        assertEquals(1, airport.flightCount());

    }

    @Test
    public void canSellTicket() {
        airport.sellTicket(flight);
        assertEquals(1, flight.ticketCount());
    }

}
