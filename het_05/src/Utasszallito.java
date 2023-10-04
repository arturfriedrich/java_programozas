public class Utasszallito extends TurbolegcsavarosGep implements HanyUtastSzallit {

    private int utasokSzama;

    public Utasszallito(String type, String flightNumber, int takeOffWeight, int sugarsebesseg, int utasokSzama) {
        super(type, flightNumber, takeOffWeight, sugarsebesseg);
        this.utasokSzama = utasokSzama;
    }

    public int getUtasokSzama() {
        return utasokSzama;
    }

    @Override
    public String toString() {
        return super.toString() + "Utasszallito{" + "utasokSzama=" + utasokSzama + '}';
    }

    @Override
    public int getHanyUtastSzallit() {
        return utasokSzama;
    }

}
