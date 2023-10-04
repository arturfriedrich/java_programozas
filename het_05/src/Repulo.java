public class Repulo implements RepulniTudo {

    private String tipus;
    private int vegsebesseg;

    public Repulo(String tipus, int vegsebesseg) {
        this.tipus = tipus;
        this.vegsebesseg = vegsebesseg;
    }

    public String getTipus() {
        return tipus;
    }

    public int getVegsebesseg() {
        return vegsebesseg;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public void setVegsebesseg(int vegsebesseg) {
        this.vegsebesseg = vegsebesseg;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", tipus: " + tipus + ", vegsebesseg: " + vegsebesseg;
    }

}
