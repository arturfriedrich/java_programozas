public class Hallgato {

    private String neptunkod;
    private String nev;
    private String email;

    public Hallgato(String neptunkod, String nev, String email) {
        this.neptunkod = neptunkod;
        this.nev = nev;
        this.email = email;
    }

    public String getNeptunkod() {
        return neptunkod;
    }

    public String getNev() {
        return nev;
    }

    public String getEmail() {
        return email;
    }

    public void setNeptunkod(String neptunkod) {
        this.neptunkod = neptunkod;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return neptunkod + " " + nev + " " + email;
    }

}
