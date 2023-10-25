import java.util.ArrayList;
import java.util.List;

public class Ugyintezes {

    private String alkalmazott;
    private List kervenyek;

    public Ugyintezes(String alkalmazott) {
        this.alkalmazott = alkalmazott;

        kervenyek = new ArrayList();
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

}
