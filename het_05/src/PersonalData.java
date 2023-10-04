public class PersonalData {

    public static void main(String[] args) {

        String name = "Friedrich Artúr";
        String neptun = "IGKAXE";
        int age = 22;
        double average = 4.4;
        boolean licence = true;

        System.out.println(String.format("%-20s%-8s%4d\t%-12s%8s", name, neptun, age, average, licence));

    }

}
