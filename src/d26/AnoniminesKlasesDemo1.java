package d26;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnoniminesKlasesDemo1 {

    public static void main(String[] args) {

        List<Mokinys> mokiniai = new ArrayList<>();
        mokiniai.add(new Mokinys(1001, "C1", "P1", LocalDate.of(2000, 1, 1), 8));
        mokiniai.add(new Mokinys(1019, "X6", "P6", LocalDate.of(2002, 12, 25), 7.5));
        mokiniai.add(new Mokinys(1002, "B2", "P2", LocalDate.of(2000, 4, 15), 5.3));
        mokiniai.add(new Mokinys(1010, "V3", "P3", LocalDate.of(2001, 5, 5), 8.3));
        mokiniai.add(new Mokinys(1012, "D4", "P4", LocalDate.of(2001, 6, 15), 9));
        mokiniai.add(new Mokinys(1015, "A5", "P5", LocalDate.of(2001, 1, 25), 9.9));

// mokiniai.forEach(m -> System.out.println(m.getFirstName()));
        for (Mokinys m : mokiniai) {
            System.out.println(m.getFirstName());
        }

//        class MokiniuComparatorius implements Comparator<Mokinys> {
//
//            @Override
//            public int compare(Mokinys o1, Mokinys o2) {
//                System.out.println("---> compare");
//                return o1.getFirstName().compareTo(o2.getFirstName());
//            }
//        }
//
//        Comparator<Mokinys> comparator = new MokiniuComparatorius();
//        mokiniai.sort(comparator);


        mokiniai.sort(new Comparator<Mokinys>() {

            @Override
            public int compare(Mokinys o1, Mokinys o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });

        System.out.println();
        mokiniai.forEach(m -> System.out.println(m.getFirstName()));
    }
}
