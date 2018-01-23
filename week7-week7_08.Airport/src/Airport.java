import java.util.ArrayList;

public class Airport {
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public Airport() {
        this.planes = new ArrayList<Plane>();
        this.flights = new ArrayList<Flight>();
    }

    public void addPlane(String id, int capacity) {
        planes.add(new Plane(id, capacity));
    }

    // Iterates list of planes until ID matched, else return null
    public Plane getPlane(String id) {
        for (Plane p : planes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public void addFlight(String id, String departureCode, String arrivalCode) {
        Plane p = getPlane(id);
        if (p != null) {
            flights.add(new Flight(p, departureCode, arrivalCode));
        }
    }

    public void printPlane(String id) {
        Plane p = getPlane(id);
        if (p != null) {
            System.out.println(p.toString());
        }
    }

    public void printPlanes() {
        for (Plane p : planes) {
            System.out.println(p.toString());
        }
    }

    public void printFlights() {
        for (Flight f : flights) {
            System.out.println(f.toString());
        }
    }
}
