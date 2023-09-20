public class CEO extends Boss{

    private String car;

    public CEO(String name, int salary, int bonus, String car) {
        super(name, salary, bonus);
        this.car = car;
    }

    public String getCar() {
        return this.car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String toString() {
        return super.toString() + " + " + this.car + " márkájú céges autó.";
    }

}
