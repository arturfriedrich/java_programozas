public class Charter extends TurbolegcsavarosGep implements HanyUtastSzallit, HanyTonnaCsomagotSzallit {

    private int utasokSzama;
    private int tonna;

    public Charter(String type, String flightNumber, int takeOffWeight, int sugarsebesseg, int utasokSzama, int tonna) {
        super(type, flightNumber, takeOffWeight, sugarsebesseg);
        this.utasokSzama = utasokSzama;
        this.tonna = tonna;
    }

    public int getUtasokSzama() {
        return utasokSzama;
    }

    public int getTonna() {
        return tonna;
    }

    @Override
    public String toString() {
        return super.toString() + "Charter{" + "utasokSzama=" + utasokSzama + ", tonna=" + tonna + '}';
    }

    @Override
    public int getHanyUtastSzallit() {
        return utasokSzama;
    }

    @Override
    public int getHanyTonnaCsomagotSzallit() {
        return tonna;
    }

}
