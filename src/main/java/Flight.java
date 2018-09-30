import java.util.ArrayList;

public class Flight {

    private String flightNumber;
    private AirportCode destination;
    private Plane plane;
    private int ticketsSold;

    public Flight(String flightNumber, AirportCode destination, Plane plane) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.plane = plane;
        this.ticketsSold = 0;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public AirportCode getDestination() {
        return this.destination;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public int getPlaneCapacity() {
        return this.plane.getPlaneType().getCapacity();
    }

    public void sellTicket() {
        this.ticketsSold += 1;
    }

    public int ticketCount() {
        return this.ticketsSold;
    }



}