import java.util.ArrayList;

public class Lista {

    public static void main(String[] args) {

        /* Hozzunk létre egy legalább 3, legfeljebb 10 elemű listát.
        Pozitív kétjegyű számokból, szamok néven (ArrayList).
        Feladatok:
        a) Törüljük a lista 3. elemét.
        b) A második helyre szúrjuk be a 88-at!
        c) Írassuk ki a lista elemeit egymás mellé, TAB-al elválasztva!
        d) Írassuk ki az első és az utolsó elemet!
        e) Ismét írassuk ki a teljes listát!
         */

        ArrayList<Integer> szamok = new ArrayList<>();

        szamok.add(11);
        szamok.add(22);
        szamok.add(33);
        szamok.add(44);

        System.out.println("a) Töröljük a lista 3. elemét.");
        // Index alapján töröljük a 3. elemet.
        szamok.remove(2);

        System.out.println("b) A második helyre szúrjuk be a 88-at!");
        // Index alapján szúrjuk be a 88-at a 2. helyre.
        szamok.add(1, 88);

        System.out.println("c) Írassuk ki a lista elemeit egymás mellé, TAB-al elválasztva!");
        // For-each ciklussal írassuk ki a lista elemeit egymás mellé, TAB-al elválasztva!
        for (int szam : szamok) {
            System.out.print(szam + "\t");
        }

        System.out.println("\nd) Írassuk ki az első és az utolsó elemet!");
        // Írassuk ki az első és az utolsó elemet!
        System.out.println("Első elem: " + szamok.get(0));
        System.out.println("Utolsó elem: " + szamok.get(szamok.size() - 1));

    }

}
