package e01.uzdavinys1;

public class Automobilis {

    private String numeris;
    private String marke;
    private Savininkas savininkas;

    public Automobilis(String numeris, String marke, Savininkas savininkas) {
        this.numeris = numeris;
        this.marke = marke;
        this.savininkas = savininkas;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public Savininkas getSavininkas() {
        return savininkas;
    }

    public void setSavininkas(Savininkas savininkas) {
        this.savininkas = savininkas;
    }
}
