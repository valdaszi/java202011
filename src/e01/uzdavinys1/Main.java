package e01.uzdavinys1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Automobilis> automobiliai = new ArrayList<>();
        automobiliai.add(new Automobilis("AAA001", "BMW", new Savininkas("Vycka", "Ecka")));
        automobiliai.add(new Automobilis("ZZA444", "Audi", new Savininkas("Petras", "Burba")));
        automobiliai.add(new Automobilis("BUB124", "Golf", new Savininkas("Antanukas", "Burba")));
        automobiliai.add(new Automobilis("HAS543", "Golf", new Savininkas("Petras", "Burba")));

//        automobiliai.sort(new Comparator<Automobilis>() {
//            @Override
//            public int compare(Automobilis o1, Automobilis o2) {
//                int cmp = o1.getSavininkas().getPavarde().compareTo(o2.getSavininkas().getPavarde());
//                if (cmp != 0) return cmp;
//
//                cmp = o1.getSavininkas().getVardas().compareTo(o2.getSavininkas().getVardas());
//                if (cmp != 0) return cmp;
//
//                return o1.getNumeris().compareTo(o2.getNumeris());
//            }
//        });

        automobiliai.sort(
                Comparator.comparing((Automobilis o) -> o.getSavininkas().getPavarde())
                        .thenComparing(o -> o.getSavininkas().getVardas())
                        // .thenComparing(o -> o.getNumeris()));
                        .thenComparing(Automobilis::getNumeris));

        automobiliai.forEach(a -> {
            System.out.println(a.getSavininkas().getPavarde() + " " +
                a.getSavininkas().getVardas() + " " +
                a.getNumeris());
        });

    }
}
