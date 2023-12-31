// az osztáy neve főnév, kezdőbetű nagybetű
public class Teszt {

    public static void main(String[] args) {
        /*
            public - látható a program bármely részéből (public, protected, private, package)
            static - osztályszintű változó, nem példányhoz kötött
            void -   nincs visszatérési érték
            main -   a program belépési pontja
            String[] args - a program argumentumai
        */
        System.out.println("Hello csapat!");

        // példány deklaráció - kijelentem, de nincs mögötte tartalom
        Macska garfield;

        // példány definíció
        garfield = new Macska("Garfield", "vörös");

        // példány/objektum üzenet
        garfield.nyavog();

        // nem lehet felülírni, mivel ez egí privát változó a macska osztályban
        // garfield.szin ="fehér";

    }

}
