public class Autokereskedes {

    private String nev;
    private Jarmu jarmuvek[];
    int db;

    public Autokereskedes(String nev, int ferohely) {
        this.nev = nev;
        this.jarmuvek = new Jarmu[ferohely];
        db = 0;
    }

    // make getters and setters
    public String getNev() {
        return nev;
    }

    public Jarmu[] getJarmuvek() {
        return jarmuvek;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void addJarmu(Jarmu jarmu) {
        if (db < jarmuvek.length) {
            jarmuvek[db] = jarmu;
            System.out.println("Jármű hozzáadva: " + jarmu.getGyarto());
            db++;
        } else {
            System.out.println("Nincs több hely, nem fér be: " + jarmu.getGyarto());
        }
    }

    // make a removeJarmu method that removes a Jarmu with given index from the array
    public void removeJarmu(int index) {
        if (index < 0 || index >= db) {
            System.out.println("Nincs ilyen indexű jármű!");
        } else {
            System.out.println("Jármű törölve: " + jarmuvek[index].getGyarto());
            for (int i = index; i < db - 1; i++) {
                jarmuvek[i] = jarmuvek[i + 1];
            }
            db--;
        }
    }

    public int getOsszertek() {
        int osszertek = 0;
        for (int i = 0; i < db; i++) {
            osszertek += jarmuvek[i].getAr();
        }
        return osszertek;
    }

    public void getOsszErtekTeljes() {
        System.out.println("Az autókereskedésben lévő járművek összértéke: " + getOsszertek() + " Ft");
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer(this.getNev() + "\n");
        sb.append("---------------------------------\n");
        sb.append("Kínálat:\n");
        int szamlalo = 0;
        for ( int i = 0; i < jarmuvek.length; i++) {
            if (jarmuvek[i] != null) {
                sb.append("\t" + ++szamlalo + "." + jarmuvek[i].toString() + "\n");
            }
        }
        sb.append("Összesen ennyi jármű van: " + szamlalo + " db\n");

        return sb.toString();
    }

}
