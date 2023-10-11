public class Raktar {

    private Raktarozhato raktarozhato[];
    private int db;

    public Raktar(int ferohely) {
        this.raktarozhato = new Raktarozhato[ferohely];
        db = 0;
    }

    public void addTermek(Raktarozhato termek) {
        if (db < raktarozhato.length) {
            raktarozhato[db] = termek;
            System.out.println("Termék hozzáadva: " + termek.getNev());
            db++;
        } else {
            System.out.println("Nincs több hely, nem fér be: " + termek.getNev());
        }
    }

    public void removeTermek(int index) {
        if (index < 0 || index >= db) {
            System.out.println("Nincs ilyen indexű termék!");
        } else {
            System.out.println("Termék törölve: " + raktarozhato[index].getNev());
            for (int i = index; i < db - 1; i++) {
                raktarozhato[i] = raktarozhato[i + 1];
            }
            db--;
        }
    }

    public int getOsszertek() {
        int osszertek = 0;
        for (int i = 0; i < db; i++) {
            osszertek += raktarozhato[i].getErtek();
        }
        return osszertek;
    }

    public void getOsszErtekTeljes() {
        System.out.println("A raktárban lévő termékek összértéke: " + getOsszertek() + " Ft");
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("A raktárban lévő termékek:\n");
        for (int i = 0; i < db; i++) {
            sb.append(raktarozhato[i] + "\n");
        }
        return sb.toString();
    }

}
