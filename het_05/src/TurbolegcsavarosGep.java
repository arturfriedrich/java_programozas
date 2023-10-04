public class TurbolegcsavarosGep extends RepuloGep {

    private int sugarsebesseg;

    public TurbolegcsavarosGep(String type, String flightNumber, int takeOffWeight, int sugarsebesseg) {
        super(type, flightNumber, takeOffWeight);
        this.sugarsebesseg = sugarsebesseg;
    }

    public int getSugarsebesseg() {
        return sugarsebesseg;
    }

    @Override
    public String toString() {
        return super.toString() + "TurbolegcsavarosGep{" + "sugarsebesseg=" + sugarsebesseg + '}';
    }

}
