public class Cargo extends TurbolegcsavarosGep implements HanyTonnaCsomagotSzallit {

    private int tonna;

    public Cargo(String type, String flightNumber, int takeOffWeight, int sugarsebesseg, int tonna) {
        super(type, flightNumber, takeOffWeight, sugarsebesseg);
        this.tonna = tonna;
    }

    public int getTonna() {
        return tonna;
    }

    @Override
    public String toString() {
        return super.toString() + "Cargo{" + "tonna=" + tonna + '}';
    }

    @Override
    public int getHanyTonnaCsomagotSzallit() {
        return tonna;
    }

}
