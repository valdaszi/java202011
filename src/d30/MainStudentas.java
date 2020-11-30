package d30;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainStudentas {

    public static void main(String[] args) {

        Zmones<Studentas> studentai = new Zmones<Studentas>();

        // studentai.add(new Zmogus("V1", "P1", LocalDate.of(2010, 1, 15)));

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            studentai.add(new Studentas("V" + random.nextInt(Integer.MAX_VALUE),
                    "P" + random.nextInt(Integer.MAX_VALUE),
                    LocalDate.of(1980 + random.nextInt(40),
                            random.nextInt(12) + 1,
                            random.nextInt(28) + 1)));
        }

        System.out.println("Viso studentu: " + studentai.size());
        System.out.println("Vidutinis amzius: " + studentai.getVidutinisAmzius());
        System.out.println("Pirmas studentas sarase: " + studentai.get(0));


//        Zmones<String> z2 = new Zmones<>();
//        z2.add("Aaaa");

        Zmones<Zmogus> z3 = new Zmones<>();
        z3.add(new Zmogus("V1", "P1", LocalDate.of(2010, 1, 15)));


        // Studentas extends Zmogus, todel:
        Zmogus z = new Studentas("S", "T", null);

        // Bet Zmones<Studentas> ne extendina Zmones<Zmogus>
        //Zmones<Zmogus> z4 = studentai;

        // Bet List<Studentas> ne extendina List<Zmogus>
        //List<Studentas> s = new ArrayList<Studentas>();
        //List<Zmogus> zListas = s;

    }
}
