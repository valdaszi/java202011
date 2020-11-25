package d24_25.d2;

import d24_25.Meteo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listai {

    public static void main(String[] args) {

        List<Meteo> meteos = new ArrayList<>();

        Meteo meteo = new Meteo();
        meteo.setKrituliai(5);
        meteo.setVejoKryptis(15);
        meteo.setVejoStiprumas(5);

        meteos.add(meteo);
        meteos.add(meteo);
        meteos.add(null);
        meteos.addAll(Arrays.asList(meteo, meteo, meteo));

//        meteos.add(new Meteo[] { meteo, meteo, meteo });
//        meteos.add(123);

        System.out.println(meteos.size());

        Meteo m = meteos.get(1);
        System.out.println(m.getKrituliai() + "mm");

        for (Meteo e : meteos) {
            if (e == null) continue;
            System.out.println(
                    e.getKrituliai() + "mm, " +
                            e.getVejoKryptis() + "°");
        }
    }
}
