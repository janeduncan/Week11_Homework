import java.util.ArrayList;

public class Plane {

    private PlaneType plane;
    private Airline airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType plane, Airline airline) {
        this.plane = plane;
        this.airline = airline;
        passengers = new ArrayList<>();
    }

    public PlaneType getPlaneType() {
        return this.plane;
    }

    public Airline getAirline() {
        return this.airline;
    }

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int passengerCount() {
        return this.passengers.size();
    }

}
