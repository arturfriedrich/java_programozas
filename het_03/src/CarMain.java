public class CarMain {

    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Focus", 2010);
        Car car2 = new Car("Opel", "Astra", 2015);
        Car car3 = new Car("Volkswagen", "Golf", 2018);

        Car car4 = new CarChild("Ford", "Focus", 2010, 5);
        Car car5 = new CarChild("BMW", "M3", 2015, 3);
        Car car6 = new CarChild("Mercedes-Benz", "W124", 2018, 4);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);

    }

}
