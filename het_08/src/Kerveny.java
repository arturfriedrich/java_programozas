public class Kerveny {

    private Hallgato hallgato;
    private Tantargy tantargy;
    private boolean eredmeny;

    public Kerveny(Hallgato hallgato, Tantargy tantargy) {
        this.hallgato = hallgato;
        this.tantargy = tantargy;
        this.eredmeny = false;
    }

    public Hallgato getHallgato() {
        return hallgato;
    }

    public Tantargy getTantargy() {
        return tantargy;
    }

    public void setHallgato(Hallgato hallgato) {
        this.hallgato = hallgato;
    }

    public void setTantargy(Tantargy tantargy) {
        this.tantargy = tantargy;
    }

    // elbírálás folyamata
    public void elbiralas(boolean eredmeny) {
        this.eredmeny = eredmeny;
    }

    public String getEredmeny() {
        return "Hallgato: " + hallgato.getNev() + " tárgy: " + tantargy.getNev() + " kérelme " + (eredmeny ? "ELFOGADVA" : "ELUTASÍTVA");
    }

    @Override
    public String toString() {
        return hallgato + " " + tantargy;
    }

}
