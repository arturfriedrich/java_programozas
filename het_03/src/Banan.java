import java.util.ArrayList;

public class Banan {

    public static void main(String[] args) {

        ArrayList<String> gyumolcsok = new ArrayList<>();
        final int ar = 50;

        int penz = 0;

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
            penz += 50;
        }

        gyumolcsok.remove("eper");

        System.out.println("A bevétele: " + gyumolcsok.size() * penz + " Ft");
    }

}
