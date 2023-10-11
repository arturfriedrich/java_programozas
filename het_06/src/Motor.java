public class Motor extends Jarmu {

    private int gyartasEve;

    public Motor(String gyarto, int ar, int gyartasEve) {
        super(gyarto, ar);
        this.gyartasEve = gyartasEve;
    }

    public int getGyartasEve() {
        return gyartasEve;
    }

    public void setGyartasEve(int gyartasEve) {
        this.gyartasEve = gyartasEve;
    }

    @Override
    public String toString() {
        return String.format("%-10s%12d Ft%10d", getGyarto(), getAr(), gyartasEve);
    }

}
