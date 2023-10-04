import java.util.ArrayList;

public class Tankhajo {

    public static void main(String[] args) {

        Repulo utasszallito = new Repulo("Boeing 747", 1000);
        Repulo hobbigep = new Repulo("Cessna 172", 200);

        Madar vorosbegy = new Madar("Vörösbegy", 50);
        Madar fecske = new Madar("Fecske", 100);

        ArrayList<RepulniTudo> repulok = new ArrayList<>();

        repulok.add(utasszallito);
        repulok.add(hobbigep);
        repulok.add(vorosbegy);
        repulok.add(fecske);

        int csucssebesseg = 0;
        for (RepulniTudo repulo : repulok) {
            if (repulo instanceof Repulo) {
                System.out.print(" *** ");
            }
            System.out.println(repulo);
            if (repulo.getSebesseg() > csucssebesseg) {
                csucssebesseg = repulo.getSebesseg();
            }
        }

        System.out.println("\nCsúcssebesség: " + csucssebesseg + " km/h");

    }

}
