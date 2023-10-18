import java.util.*;

public class ListaSzerkezetek {

    public static void main(String[] args) {

        Vector focistak = new Vector();
        focistak.add("Haaland");

        Jatekos messi = new Jatekos("Messi", 10, "középpályás");
        Jatekos lewandowski = new Jatekos("Lewandowski", 9, "csatár");
        Jatekos simon = new Jatekos("Simon", 44, "átlövő");
        Jatekos ronaldo = new Jatekos("C. Ronaldo", 7, "csatár");

        focistak.add(messi);
        focistak.add(messi);
        focistak.add(new Jatekos("Messi", 10, "középpályás"));

        focistak.remove(messi);
        focistak.remove(messi);
        focistak.remove(0);

        focistak.add(lewandowski);
        focistak.add(ronaldo);

        for (Object o : focistak) {
            System.out.println(o);
        }
        System.out.println("----------------------------------------------");

        Vector<Jatekos> aranylabdasok = new Vector<>();
        aranylabdasok.add(messi);
        aranylabdasok.add(lewandowski);
        aranylabdasok.add(simon);

        aranylabdasok.remove(2);
        // aranylabdasok.remove(2);

        aranylabdasok.add(ronaldo);

        System.out.println("Ismeri valaki C. Ronadlüt? " + (aranylabdasok.contains(ronaldo) ? "Igen" : "Nem"));


        for (Object o : aranylabdasok) {
            System.out.println(o);
        }

        System.out.println("----------------------------------------------");

        java.util.ArrayList<Jatekos> aranylabdasok2 = new java.util.ArrayList<>();

        aranylabdasok2.add(messi);
        aranylabdasok2.add(ronaldo);
        aranylabdasok2.add(1, lewandowski);

        for (Object o : aranylabdasok2) {
            System.out.println(o);
        }

        System.out.println("Összesen ennyi aranylabdás van: " + aranylabdasok2.size());

        System.out.println("----------------------------------------------");

        Stack<Jatekos> aranylabdasok3 = new Stack<>();

        aranylabdasok3.add(lewandowski);
        aranylabdasok3.add(messi);
        aranylabdasok3.add(ronaldo);

        System.out.println("Utoljára berakott: " + aranylabdasok3.peek());
        System.out.println("Ki nem fog nyerni: " + aranylabdasok3.pop());

        Jatekos nyerniFog = aranylabdasok3.push(messi);
        System.out.println("Nyerni fog: " + nyerniFog);

        for (Object o : aranylabdasok3) {
            System.out.println(o);
        }

        System.out.println("----------------------------------------------");

        LinkedList<Jatekos> aranylabdasok4 = new LinkedList<>();

        aranylabdasok4.addAll(focistak);

        for (Object o : aranylabdasok4) {
            System.out.println(o);
        }

        System.out.println("Az első elem: " + aranylabdasok4.getFirst().getNev());
        System.out.println("Az utolsó elem: " + aranylabdasok4.getLast().getNev());

        System.out.println("----------------------------------------------");

        Queue<Jatekos> legjobbak = new LinkedList<>();
        // Queue<Jatekos> legjobbak2 = new Queue<>();

        legjobbak.addAll(focistak);

        Jatekos elsojatekos = legjobbak.element();
        System.out.println("Az első játékos: " + elsojatekos.getNev());
        legjobbak.remove();

        for (Object o : legjobbak) {
            System.out.println(o);
        }

        System.out.println("Ki jön most a sorban: " + legjobbak.peek().getNev());

        System.out.println("----------------------------------------------");

        Queue<Jatekos> legjobbak2 = new PriorityQueue<>();

        legjobbak2.add(lewandowski);
        legjobbak2.add(ronaldo);
        legjobbak2.add(messi);
        legjobbak.add(new Jatekos("Lewandowski", 9, "csatár"));

        for (Object o : legjobbak2) {
            System.out.println(o);
        }

        System.out.println("----------------------------------------------");

        ArrayList<Jatekos> aranylabdasok5 = new ArrayList<>();

        aranylabdasok5.addAll(focistak);
        System.out.println("Rendezés előtt: ");
        for (Object o : aranylabdasok5) {
            System.out.println(o);
        }

        Collections.sort(aranylabdasok5);

        System.out.println("Rendezés után: ");
        for (Object o : aranylabdasok5) {
            System.out.println(o);
        }

    }

}
