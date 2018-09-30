import java.util.ArrayList;

public class Airport {

    private AirportCode airportCode;
    private ArrayList<Flight> flights;
    private ArrayList<Hangar> hangars;

    public Airport(AirportCode airportCode) {
        this.airportCode = airportCode;
        flights = new ArrayList<>();
        hangars = new ArrayList<>();
    }

    public AirportCode getAirportCode() {
        return airportCode;
    }

    public int flightCount() {
        return this.flights.size();
    }

    public int hangarCount() {
        return this.hangars.size();
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public void addHangar(Hangar hangar) {
        this.hangars.add(hangar);
    }

    public void createFlight(String flightNumber, AirportCode destination, Plane plane) {
        Flight flight = new Flight(flightNumber, destination, plane);
        addFlight(flight);
        assignPlaneFromHangar(plane);
    }

    private void assignPlaneFromHangar(Plane thePlane) {
        for(int i = 0; i < hangars.size(); i++) {
            if (hangars.get(i).containsPlane(thePlane)) {
                hangars.get(i).removePlane(thePlane);
            }
        }
    }

    public int totalPassengersOnFlight(Flight flight) {
        return flight.ticketCount();
    }

    public void sellTicket(Flight flight) {
        if (flight.ticketCount() < flight.getPlaneCapacity()) {
            flight.sellTicket();
        }
    }

}