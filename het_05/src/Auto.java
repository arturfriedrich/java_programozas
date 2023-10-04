public class Auto {

    private String gyarto;
    private String model;

    public Auto(String gyarto, String model) {
        this.gyarto = gyarto;
        this.model = model;
    }

    public String getGyarto() {
        return gyarto;
    }

    public String getModel() {
        return model;
    }

    public void setGyarto(String gyarto) {
        this.gyarto = gyarto;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", gyarto: " + gyarto + ", modell: " + model;
    }

}
