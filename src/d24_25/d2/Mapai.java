package d24_25.d2;

import d24_25.Meteo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Mapai {

    public static void main(String[] args) {

        Meteo m1 = new Meteo();
        m1.setLaikas(LocalDateTime.of(2020, 11, 1, 0, 15));
        m1.setKrituliai(5);
        m1.setVejoKryptis(15);
        m1.setVejoStiprumas(5);

        Meteo m2 = new Meteo();
        m2.setLaikas(LocalDateTime.of(2020, 11, 1, 12, 15));
        m2.setKrituliai(0);
        m2.setVejoKryptis(127);
        m2.setVejoStiprumas(3);

        Meteo m3 = new Meteo();
        m3.setLaikas(LocalDateTime.of(2020, 11, 2, 0, 15));
        m3.setKrituliai(15);
        m3.setVejoKryptis(45);
        m3.setVejoStiprumas(6);

//        LocalDate key;
//        List<Meteo> value;

        List<Meteo> l1 = new ArrayList<>();
        l1.add(m1);
        l1.add(m2);

        Map<LocalDate, List<Meteo>> mapas = new HashMap<>();
        mapas.put(LocalDate.of(2020, 11, 1), l1);

        List<Meteo> l2 = new ArrayList<>();
        l2.add(m3);
        mapas.put(LocalDate.of(2020, 11, 2), l2);

        System.out.println(mapas.size());

        mapas.put(LocalDate.of(2020, 11, 3), null);

        System.out.println(mapas.size());

        mapas.remove(LocalDate.of(2020, 11, 3));

        System.out.println(mapas.size());

        List<Meteo> v1 = mapas.get(LocalDate.of(2020, 11, 1));
        System.out.println(v1);


        List<Meteo> visi = new ArrayList<>();
        visi.add(m1);
        visi.add(m2);
        visi.add(m3);
        visi.add(m3);
        visi.add(m3);

        Map<LocalDate, List<Meteo>> map = buildMap(visi);
        System.out.println("map.size = " + map.size());
        System.out.println(map);

        // Kaip toks pat Map'as pasidaro naudojant kolekciju streamus:
        Map<LocalDate, List<Meteo>> map2 =
                visi.stream().collect(Collectors.groupingBy(m -> m.getLaikas().toLocalDate()));
        System.out.println(map2);
    }

    static Map<LocalDate, List<Meteo>> buildMap(List<Meteo> list) {
        Map<LocalDate, List<Meteo>> result = new HashMap<>();
        for (Meteo m : list) {
            LocalDate diena = m.getLaikas().toLocalDate();
            if (result.containsKey(diena)) {
                List<Meteo> listas = result.get(diena);
                listas.add(m);
            } else {
                List<Meteo> listas = new ArrayList<>();
                result.put(diena, listas);
                listas.add(m);
            }
        }
        return result;
    }
}
