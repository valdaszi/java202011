package d24_25;

import java.time.LocalDateTime;
import java.util.Objects;

public class Meteo implements Comparable<Meteo> { // extends Object {

    private LocalDateTime laikas;
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

    public Meteo(LocalDateTime laikas, Double temperatura, int vejoKryptis, double vejoStiprumas, int krituliai) {
        this.laikas = laikas;
        this.temperatura = temperatura;
        this.vejoKryptis = vejoKryptis;
        this.vejoStiprumas = vejoStiprumas;
        this.krituliai = krituliai;
    }

    public LocalDateTime getLaikas() {
        return laikas;
    }

    public void setLaikas(LocalDateTime laikas) {
        this.laikas = laikas;
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

//    @Override
//    public boolean equals(Object obj) {
//        // return super.equals(obj);
//        // return (this == obj);
//        System.out.println("??? equals");
//        Meteo m = (Meteo) obj;
//        return this.vejoKryptis == m.vejoKryptis &&
//                this.krituliai == m.krituliai &&
//                this.vejoStiprumas == m.vejoStiprumas &&
//                Objects.equals(this.temperatura, m.temperatura);
//
//    }
//
//    @Override
//    public int hashCode() {
//        // return super.hashCode();
//        System.out.println("??? hashCode");
//        return Objects.hash(vejoKryptis, krituliai, vejoStiprumas, temperatura);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meteo meteo = (Meteo) o;
        return vejoKryptis == meteo.vejoKryptis &&
                Double.compare(meteo.vejoStiprumas, vejoStiprumas) == 0 &&
                krituliai == meteo.krituliai &&
                Objects.equals(temperatura, meteo.temperatura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatura, vejoKryptis, vejoStiprumas, krituliai);
    }

    @Override
    public int compareTo(Meteo o) {
        System.out.println("??? compareTo");
        return 0;
    }

//    @Override
//    public String toString() {
//        return laikas + ", vejoKryptis=" + vejoKryptis;
//    }

    @Override
    public String toString() {
        return "Meteo{" +
                "laikas=" + laikas +
                ", temperatura=" + temperatura +
                ", vejoKryptis=" + vejoKryptis +
                ", vejoStiprumas=" + vejoStiprumas +
                ", krituliai=" + krituliai +
                '}';
    }
}
