package d17;

import d17.d2.Utilities;

public class Main {

    public static void main(String[] args) {

        Zmogus z;
        z = new Zmogus();
        z.pavarde = "Jonaitis";
        z.vardas = "Jurgis";

        Zmogus z2 = z;
        System.out.println(z2.vardas);

        z2.vardas = "Petras";
        System.out.println(z.vardas);
        System.out.println(z2.vardas);

        Zmogus z3 = new Zmogus("Ona", "Jone");
        System.out.println(z3.vardas + " " + z3.pavarde);

        System.out.println("z3 " + Utilities.kasYraKas(z3));

//        Zmogus[] zmones = new Zmogus[2];
//        zmones[0] = z2;
//        zmones[1] = z3;

        System.out.println("Spausdiname masyvus: ");

        Zmogus[] zmones = { z2, z3, new Zmogus("Henrikas XVI") };
        String[] vardai = { "Antanas", "Birute", "Maryte" };

        for (String vardas : vardai) {
            System.out.println(vardas);
        }

        System.out.println("Spausdiname zmoniu masyva: ");

        for (Zmogus zmogus : zmones) {
            Utilities.spausdintiZmogu(zmogus);
        }


        Mokinys m1 = new Mokinys();
        m1.vardas = "Antanukas";
        m1.pavarde = "Bumbuliukas";
        m1.klase = 1;

        System.out.println("m1 " + Utilities.kasYraKas(m1));

        //Utilities.spausdintiZmogu(m1);

    }
}
