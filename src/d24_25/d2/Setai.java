package d24_25.d2;

import d24_25.Meteo;

import java.util.*;

public class Setai {

    public static void main(String[] args) {
        Meteo m1 = new Meteo();
        m1.setKrituliai(5);
        m1.setVejoKryptis(15);
        m1.setVejoStiprumas(5);

        Meteo m2 = m1;

        Meteo m3 = new Meteo();
        m3.setKrituliai(5);
        m3.setVejoKryptis(15);
        m3.setVejoStiprumas(5);

        Meteo m4 = new Meteo();
        m4.setKrituliai(5);
        m4.setVejoKryptis(15);
        m4.setVejoStiprumas(6);

        Set<Meteo> meteos = new TreeSet<>();
        System.out.println(meteos.add(m1));
        System.out.println(meteos.add(m2));
        System.out.println(meteos.add(m3));
        System.out.println(meteos.add(m4));

        System.out.println(meteos.size());


//        Collection<String> text = new TreeSet<>();
//        text.add("Ą1");
//        text.add("XA");
//        text.add("A1");
//        text.add("FA");
//        text.add("BX");
//        System.out.println(text);

    }
}
