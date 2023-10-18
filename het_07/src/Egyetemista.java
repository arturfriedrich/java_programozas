import java.util.ArrayList;

public class Egyetemista {

    private String nev;
    private int kor;
    ArrayList<Tantargy> tantargyak;

    public Egyetemista(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
        this.tantargyak = new ArrayList<>();
    }

    public String getNev() {
        return this.nev;
    }

    public int getKor() {
        return this.kor;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void addTantargy(Tantargy tantargy) {
        this.tantargyak.add(tantargy);
    }

    public void addTantargy2(String nev, int osztalyzat) {
        this.tantargyak.add(new Tantargy(nev, osztalyzat));
    }

    public float atlag() {
        float osszeg = 0;
        for (Tantargy tantargy : this.tantargyak) {
            osszeg += tantargy.getOsztalyzat();
        }
        return osszeg / this.tantargyak.size();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(this.nev + " (" + this.kor + ")\n");
        sb.append("--------------------------------\n");
        for (Tantargy tantargy : this.tantargyak) {
            sb.append("\t" + tantargy.getNev() + "\t" + tantargy.getOsztalyzat() + "\n");
        }
        return sb.toString();
    }

}
