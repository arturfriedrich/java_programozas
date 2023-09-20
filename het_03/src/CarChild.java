public class CarChild extends Car{

    private int numberOfDoors;

    public CarChild(String manufacturer, String type, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, type, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + ", numberOfDoors: " + numberOfDoors;
    }

}
