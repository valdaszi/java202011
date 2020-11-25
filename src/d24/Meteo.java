package d24;

public class Meteo {

    private Double temperatura;
    private int vejoKryptis;
    private double vejoStiprumas;
    private int krituliai;

    public Meteo() {
    }

    public Meteo(double temperatura, int vejoKryptis, double vejoStiprumas, int krituliai) {
        this.temperatura = new Double(temperatura);
        this.vejoKryptis = vejoKryptis;
        this.vejoStiprumas = vejoStiprumas;
        this.krituliai = krituliai;
    }

    public Double getTemperatura() {
        return temperatura;  // .doubleValue();
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public int getVejoKryptis() {
        return vejoKryptis;
    }

    public void setVejoKryptis(int vejoKryptis) {
        this.vejoKryptis = vejoKryptis;
    }

    public double getVejoStiprumas() {
        return vejoStiprumas;
    }

    public void setVejoStiprumas(double vejoStiprumas) {
        this.vejoStiprumas = vejoStiprumas;
    }

    public int getKrituliai() {
        return krituliai;
    }

    public void setKrituliai(int krituliai) {
        this.krituliai = krituliai;
    }
}
