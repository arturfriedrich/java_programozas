public class Macska {
    // az osztály adattagjai
    // adatleíró tagok
    private String szin;
    private String nev;

    /* konstruktor - a példányosítás során hívódik meg
      mindig ugyanaz a neve, mint az osztálynak
      nincs visszatérési értéke
      mindig publikus */
    public Macska(String neve, String szine) {
        // szin = "szürke";
        // nev = "Cirmi";
        szin = szine;
        nev = neve;
    }

    // metódus
    public void nyavog() {
        System.out.println("Miau!");
    }
}
