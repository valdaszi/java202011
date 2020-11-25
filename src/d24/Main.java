package d24;

import java.math.BigInteger;

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

        // double vid = vidutineTemperatura(new Meteo[]{meteo, meteo2, meteo3});
        IKolekcija kolekcija = new Kolekcija();
        kolekcija.push(meteo);
        kolekcija.push(meteo2);
        kolekcija.push(meteo3);
        kolekcija.put(0, meteo3);
        kolekcija.remove(3);
        double vid = vidutineTemperatura(kolekcija);
        System.out.println("Visutine temperatura: " + vid);

        // byte -> short -> int -> long -> float -> double
        byte b = 127;
        double d = b;
        byte b2 = (byte) d;
        System.out.println(b2);

        // int 100 -> double 100 -> Double
        Float x = 100.0f;
        Float f1 = x * 2 / 3;

        BigInteger bi = BigInteger.valueOf(1);
        bi = bi.add(BigInteger.ONE);
        System.out.println(bi);

//        int x;
//        if (Math.random() < 2) x = 123;
//        System.out.println(x);
    }

    static double vidutineTemperatura(IKolekcija kolekcija) {
        double viso = 0;
        int reiksmiuSk = 0;
        for (int i = 0; i < kolekcija.size(); i++) {
            Meteo m = kolekcija.get(i);
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
