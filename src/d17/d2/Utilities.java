package d17.d2;

import d17.Mokinys;
import d17.Zmogus;

public class Utilities {

    public static void spausdintiZmogu(Zmogus z) {
        System.out.println("---------------------");
        System.out.println("vardas: " + z.vardas);
        System.out.println("pavarde: " +
                (z.pavarde == null ? "-be pavardes-" : z.pavarde));
        System.out.println("---------------------");
    }

    public static String kasYraKas(Object x) {
        String kas = "";
        if (x instanceof Zmogus) {
            kas = "yra Zmogus";
        } else {
            kas = "nera Zmogus";
        }
        if (x instanceof Mokinys) {
            kas = kas + " ir yra Mokinys";
        } else {
            kas = kas + " ir nera Mokinys";
        }
        return kas;
    }

}
