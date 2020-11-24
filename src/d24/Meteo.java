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


class Main {
    public static void main(String[] args) {
        Meteo meteo = new Meteo();
        meteo.setKrituliai(5);
        meteo.setVejoKryptis(15);
        meteo.setVejoStiprumas(5);
        // rasau i DB

        System.out.println(meteo.getTemperatura());


        Meteo meteo2 = new Meteo();
        meteo2.setKrituliai(6);
        meteo2.setVejoKryptis(45);
        meteo2.setVejoStiprumas(0);
        meteo2.setTemperatura(15.5);

        Meteo meteo3 = new Meteo();
        meteo3.setKrituliai(0);
        meteo3.setVejoKryptis(19);
        meteo3.setVejoStiprumas(2);
        meteo3.setTemperatura(10.);

        double vid = vidutineTemperatura(new Meteo[] { meteo, meteo2, meteo3 });
        System.out.println("Visutine temperatura: " + vid);


//        int x;
//        if (Math.random() < 2) x = 123;
//        System.out.println(x);
    }

    static double vidutineTemperatura(Meteo[] meteo) {
        double viso = 0;
        int reiksmiuSk = 0;
        for (Meteo m : meteo) {
            if (m.getTemperatura() != null) {
                viso += m.getTemperatura();
                reiksmiuSk++;
            }
            // viso = viso + m.getTemperatura().doubleValue();
        }
        // return viso / meteo.length;
        return viso / reiksmiuSk;
    }
}
