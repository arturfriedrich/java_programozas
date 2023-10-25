public class Kerveny {

    enum Statusz {
        BEADVA,
        ELBIRALAS_ALATT,
        ELFOGADVA,
        ELUTASITVA,
        HIANYPOTLAS,
        TOROLVE;
    }

    private Hallgato hallgato;
    private Tantargy tantargy;
    private Kerveny.Statusz eredmeny;

    public Kerveny(Hallgato hallgato, Tantargy tantargy) {
        this.hallgato = hallgato;
        this.tantargy = tantargy;
        this.eredmeny = Kerveny.Statusz.BEADVA;
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

    public Kerveny.Statusz isEredmeny() {
        return eredmeny;
    }

    // elbírálás folyamata
    public void elbiralas(boolean eredmeny) {
        this.eredmeny = eredmeny ? Kerveny.Statusz.ELFOGADVA : Kerveny.Statusz.ELUTASITVA;
    }

    public void elbiralas(Kerveny.Statusz eredmeny) {
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
