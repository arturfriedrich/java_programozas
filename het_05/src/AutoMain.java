import java.util.ArrayList;

public class AutoMain {

    public static void main(String[] args) {

        SportKocsi ferrari = new SportKocsi("Ferrari", "F40", true);
        SportKocsi porsche = new SportKocsi("Porsche", "911", false);

        Ketutemu trabant = new Ketutemu("Trabant", "601", false);
        Ketutemu barkas = new Ketutemu("Barkas", "100", true);

        ArrayList<Auto> kocsik = new ArrayList<>();
        kocsik.add(ferrari);
        kocsik.add(porsche);
        kocsik.add(trabant);
        kocsik.add(barkas);

        for (Auto auto : kocsik) {
            System.out.println(auto);
        }

    }

}
