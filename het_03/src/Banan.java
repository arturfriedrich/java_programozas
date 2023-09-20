import java.util.ArrayList;

public class Banan {

    public static void main(String[] args) {

        ArrayList<String> gyumolcsok = new ArrayList<>();

        gyumolcsok.add("alma");
        gyumolcsok.add("banán");
        gyumolcsok.add("dinnye");

        for (int i = 0; i < 4; i++) {
            gyumolcsok.add("alma");
        }

        gyumolcsok.add(gyumolcsok.indexOf("banán"), "eper");
        gyumolcsok.remove(gyumolcsok.indexOf("banán"));

        System.out.println(gyumolcsok.contains("dinnye") ? "Van benne dinnye" : "Nincs benne dinnye");

        while (gyumolcsok.contains("alma")) {
            gyumolcsok.remove("alma");
        }

        gyumolcsok.remove("eper");

        final int ar = 50;
        System.out.println("A bevétele: " + gyumolcsok.size() * ar + " Ft");
    }

}
