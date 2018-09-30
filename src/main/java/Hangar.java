import java.util.ArrayList;

public class Hangar {

    private String name;
    private Airline airline;
    private ArrayList<Plane> planes;

    public Hangar(String name, Airline airline) {
        this.name = name;
        this.airline = airline;
        planes = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public Airline getAirline() {
        return this.airline;
    }

    public int planeCount() {
        return this.planes.size();
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public void remove(Plane plane) {
        this.planes.remove(plane);
    }

}
