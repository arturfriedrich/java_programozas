public class Tantargy {

    private String nev;
    private int kredit;

    public Tantargy(String nev, int kredit) {
        this.nev = nev;
        this.kredit = kredit;
    }

    public String getNev() {
        return nev;
    }

    public int getKredit() {
        return kredit;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKredit(int kredit) {
        this.kredit = kredit;
    }

    @Override
    public String toString() {
        return nev + " " + kredit;
    }

}
