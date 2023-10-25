import java.util.ArrayList;
import java.util.List;

public class Ugyintezes {

    private String alkalmazott;
    private List<Kerveny> kervenyek;

    public Ugyintezes(String alkalmazott) {
        this.alkalmazott = alkalmazott;

        kervenyek = new ArrayList<Kerveny>();
    }

    public String getAlkalmazott() {
        return alkalmazott;
    }

    public void setAlkalmazott(String alkalmazott) {
        this.alkalmazott = alkalmazott;
    }

    public List getKervenyek() {
        return kervenyek;
    }

    // lista karbantartó műveletek
    public void addKerveny(Kerveny kerveny) {
        kervenyek.add(kerveny);
    }

    public void removeKerveny(Kerveny kerveny) {
        if (kervenyek.contains(kerveny)) {
            kervenyek.remove(kerveny);
        } else {
            System.out.println("Nincs ilyen kérvény");
        }
    }

    public int getElutasitottKervenyekSzama() {
        int db = 0;
        for (Kerveny k : kervenyek) {
            if (k.isEredmeny() == Kerveny.Statusz.ELUTASITVA) {
                db++;
            }
        }
        return db;
    }

    public int getElfogadottKervenyekSzama() {
        int db = 0;
        for (Kerveny k : kervenyek) {
            if (k.isEredmeny() == Kerveny.Statusz.ELFOGADVA) {
                db++;
            }
        }
        return db;
    }

}
