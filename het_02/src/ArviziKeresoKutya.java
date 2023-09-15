public class ArviziKeresoKutya extends KeresoKutya {

    private int merulesiMelyseg;

    // Konstruktor
    public ArviziKeresoKutya(String nev, int kor, String fajta, int keresesiHatekonysag, int merulesiMelyseg) {
        super(nev, kor, fajta, keresesiHatekonysag);
        this.merulesiMelyseg = merulesiMelyseg;
    }

    public int getMerulesiMelyseg() { return merulesiMelyseg; }

    public String toString() {
        return super.toString() + " Merülési mélység: " + merulesiMelyseg + "m.";
    }
}
