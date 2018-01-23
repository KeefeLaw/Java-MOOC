public class Flight {
    private Plane plane;
    private String departureCode;
    private String arrivalCode;

    public Flight(Plane plane, String departureCode, String arrivalCode) {
        this.plane = plane;
        this.departureCode = departureCode;
        this.arrivalCode = arrivalCode;
    }

    public String toString() {
        return String.format("%s (%s-%s)", plane.toString(), departureCode, arrivalCode);
    }
}
