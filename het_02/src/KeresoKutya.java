// Öröklődés, lemásoljuk a Kutya osztályt, és kiegészítjük további adattagokkal és metódusokkal
// ezt az extends kulcsszóval végezzük
public class KeresoKutya extends Kutya {

    private int keresesiHatekonysag;

    // Konstruktor
    public KeresoKutya(String nev, int kor, String fajta, int keresesiHatekonysag) {
        // A super kulcsszóval hivatkozunk az ősosztály konstruktorára
        super(nev, kor, fajta);
        this.fajta = fajta;         // ez nem javasolt mért más osztályok is elérhetik az adattagot
        // A this kulcsszóval hivatkozunk az aktuális osztály adattagjaira
        this.keresesiHatekonysag = keresesiHatekonysag;
    }

    // Getter a keresési hatékonyságnak
    public int getKeresesiHatekonysag() {
        return keresesiHatekonysag;
    }

    public String toString() {
        // A super kulcsszóval hivatkozunk az ősosztály metódusaira
        return super.toString() + " Keresési hatékonyság: " + keresesiHatekonysag + "%.";
    }

}
