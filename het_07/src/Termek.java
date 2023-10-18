import java.util.ArrayList;

public class Termek {

    private String nev;
    private int ar;
    private ArrayList<Hozzavalo> hozzavalok;

    public Termek(String nev, int ar) {
        this.nev = nev;
        this.ar = ar;
        this.hozzavalok = new ArrayList<>();
    }

    public void addHozzavalo(Hozzavalo hozzavalo) {
        this.hozzavalok.add(hozzavalo);
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public ArrayList<Hozzavalo> getHozzavalok() {
        return hozzavalok;
    }

    public void setHozzavalok(ArrayList<Hozzavalo> hozzavalok) {
        this.hozzavalok = hozzavalok;
    }

    public boolean vanBenneCukor() {
        for (Hozzavalo hozzavalo : hozzavalok) {
            if (hozzavalo.getHozzavaloNeve().equals("Cukor")) {
                return true;
            }
        }
        return false;
    }

    public int getEloallitasiKoltseg() {
        int osszKoltseg = 0;
        for (Hozzavalo hozzavalo : hozzavalok) {
            osszKoltseg += (int) (hozzavalo.getAr() * hozzavalo.getMennyiseg());
        }
        return osszKoltseg;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %8d Ft\n", nev, ar));
        sb.append("---------------------------------------------\n");
        for (Hozzavalo hozzavalo : hozzavalok) {
            sb.append(hozzavalo).append("\n");
        }
        return sb.toString();
    }

}
