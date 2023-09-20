public class Car {

    private String manufacturer;
    private String type;
    private int yearOfManufacture;

    public Car(String manufacturer, String type, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.type = type;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String toString() {
        return "Manufacturer: " + manufacturer + ", type: " + type + ", yearOfManufacture: " + yearOfManufacture;
    }

}
