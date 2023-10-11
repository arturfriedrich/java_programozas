public class AutoKerMain {

    public static void main(String[] args) {

        Autokereskedes autoker = new Autokereskedes("Friedrich Autókereskedés", 3);

        autoker.addJarmu(new Jarmu("Opel", 4000000));
        autoker.addJarmu(new Jarmu("BMW", 1400000));
        autoker.addJarmu(new Jarmu("Audi", 2000000));

        autoker.removeJarmu(1);

        autoker.addJarmu(new Motor("Kawasaki", 2000000, 2010));

        System.out.println(autoker);

        autoker.getOsszErtekTeljes();

    }

}
