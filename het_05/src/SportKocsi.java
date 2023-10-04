public class SportKocsi extends Auto {

    private boolean isForgalomban;

    public SportKocsi(String gyarto, String model, boolean isForgalomban) {
        super(gyarto, model);
        this.isForgalomban = isForgalomban;
    }

    public boolean isForgalomban() {
        return isForgalomban;
    }

    public void setForgalomban(boolean isForgalomban) {
        this.isForgalomban = isForgalomban;
    }

    @Override
    public String toString() {
        return super.toString() + ", forgalomban: " + (isForgalomban ? "igen" : "nem");
    }

}
