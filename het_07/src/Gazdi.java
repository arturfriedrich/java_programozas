import java.util.ArrayList;

public class Gazdi {

    private String nev;
    private int kor;
    private ArrayList<String> kutyai;

    public Gazdi(String nev, int kor) {
        this.nev = nev;
        this.kor = kor;
        this.kutyai = new ArrayList<>();
    }

    public String getNev() {
        return this.nev;
    }

    public int getKor() {
        return this.kor;
    }

    public ArrayList<String> getKutyai() {
        return this.kutyai;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void addKutya(String kutyaNev) {
        this.kutyai.add(kutyaNev);
    }

    public void negynelHosszabb() {
        for (String kutyaNev : this.getKutyai()) {
            if (kutyaNev.length() > 4) {
                System.out.println(kutyaNev);
            }
        }
    }

    public int hanyNegynelHosszabb() {
        int db = 0;
        for (String kutyaNev : this.getKutyai()) {
            if (kutyaNev.length() > 4) {
                db++;
            }
        }
        return db;
    }

    public void kiirBbetusKutyak() {
        for (String kutyaNev : this.getKutyai()) {
            if (kutyaNev.charAt(0) == 'B') {
                System.out.println(kutyaNev);
            }
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(this.getNev() + " (" + this.getKor() + ")\n");
        sb.append("--------------------------------\n");
        for (String kutyaNev : this.getKutyai()) {
            sb.append(kutyaNev).append("\n");
        }
        return sb.toString();
    }

}
