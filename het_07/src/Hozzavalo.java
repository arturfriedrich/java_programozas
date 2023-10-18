public class Hozzavalo {

    private String hozzavaloNeve;
    private double mennyiseg;
    private int ar;

    public Hozzavalo(String hozzavaloNeve, double mennyiseg, int ar) {
        this.hozzavaloNeve = hozzavaloNeve;
        this.mennyiseg = mennyiseg;
        this.ar = ar;
    }

    public String getHozzavaloNeve() {
        return hozzavaloNeve;
    }

    public void setHozzavaloNeve(String hozzavaloNeve) {
        this.hozzavaloNeve = hozzavaloNeve;
    }

    public double getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(double mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return String.format("%-20s %8.2f %-3s %8d Ft", hozzavaloNeve, mennyiseg, "dkg", ar);
    }

}
