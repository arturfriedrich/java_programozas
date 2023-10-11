public class MinosegiTermek extends Termek implements Raktarozhato {

    private String szin;

    public MinosegiTermek(String nev, int ertek, String szin) {
        super(nev, ertek);
        this.szin = szin;
    }

    public String getSzin() {
        return szin;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    @Override
    public String toString() {
        return String.format("%-10s%20d Ft%10s", getNev(), getErtek(), szin);
    }

}
