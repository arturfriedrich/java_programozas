public class RepuloGep {

    private String type;
    private String flightNumber;
    private int takeOffWeight;

    public RepuloGep(String type, String flightNumber, int takeOffWeight) {
        this.type = type;
        this.flightNumber = flightNumber;
        this.takeOffWeight = takeOffWeight;
    }

    public String getType() {
        return type;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getTakeOffWeight() {
        return takeOffWeight;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", type=" + type + ", flightNumber=" + flightNumber + ", takeOffWeight=" + takeOffWeight + '}';
    }

}
