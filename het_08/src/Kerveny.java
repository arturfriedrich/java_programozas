public class Kerveny {

    private Hallgato hallgato;
    private Tantargy tantargy;
    private KervenyStatusz eredmeny;

    public Kerveny(Hallgato hallgato, Tantargy tantargy) {
        this.hallgato = hallgato;
        this.tantargy = tantargy;
        this.eredmeny = KervenyStatusz.BEADVA;
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

    public KervenyStatusz isEredmeny() {
        return eredmeny;
    }

    // elbírálás folyamata
    public void elbiralas(boolean eredmeny) {
        this.eredmeny = eredmeny ? KervenyStatusz.ELFOGADVA : KervenyStatusz.ELUTASITVA;
    }

    public void elbiralas(KervenyStatusz eredmeny) {
        this.eredmeny = eredmeny;
    }

    public String getEredmeny() {
        return "Hallgato: " + hallgato.getNev() + " tárgy: " + tantargy.getNev() + " kérelme " + eredmeny;
    }

    @Override
    public String toString() {
        return hallgato + " " + tantargy;
    }

}
