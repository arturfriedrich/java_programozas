public class Matek {

    public static void main(String[] args) {

        System.out.println("Pi értéke: " + Math.PI);
        System.out.println("Euler-szám értéke: " + Math.E);
        System.out.println("Gyök 30 értéke: " + Math.sqrt(30));
        System.out.println("Abszolútérték -30: " + Math.abs(-30));
        System.out.println("Sinus 40: " + Math.sin(40));
        System.out.println("Kettő az ötödiken: " + Math.pow(2, 5));
        System.out.println("Kerekítés 3.14: " + Math.round(3.14));
        System.out.println("Kerekítés 3.54: " + Math.round(3.54));
        System.out.println("2.333 felkerekítve: " + Math.ceil(2.333));
        System.out.println("2.666 lekerekítve: " + Math.floor(2.666));
        System.out.println("-10 és 6 minimuma: " + Math.min(-10, 6));
        System.out.println("Random szám: " + Math.random());

        int number = (int) (Math.random() * 90) + 1;
        System.out.println("Random szám 0 és 100 között: " + number);

    }

}
