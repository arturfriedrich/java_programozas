public class Madar implements RepulniTudo {

    private String faj;
    private int sebesseg;

    public Madar(String faj, int sebesseg) {
        this.faj = faj;
        this.sebesseg = sebesseg;
    }

    public String getFaj() {
        return faj;
    }

    public int getSebesseg() {
        return sebesseg;
    }

    public void setFaj(String faj) {
        this.faj = faj;
    }

    public void setSebesseg(int sebesseg) {
        this.sebesseg = sebesseg;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", faj: " + faj + ", sebesseg: " + sebesseg;
    }

}
