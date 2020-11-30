package d30;

import java.time.LocalDate;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Zmones zmones = new Zmones();

        zmones.add(new Zmogus("V1", "P1", LocalDate.of(2010, 1, 15)));
        zmones.add(new Zmogus("V2", "P2", LocalDate.of(2000, 2, 3)));

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            zmones.add(new Zmogus("V" + random.nextInt(Integer.MAX_VALUE),
                    "P" + random.nextInt(Integer.MAX_VALUE),
                    LocalDate.of(1980 + random.nextInt(40),
                            random.nextInt(12) + 1,
                            random.nextInt(28) + 1)));
        }

        System.out.println("Viso zmoniu: " + zmones.size());
        System.out.println("Vidutinis amzius: " + zmones.getVidutinisAmzius());
        System.out.println("Pirmas zmogus sarase: " + zmones.get(0));


//        for (int i = 0; i < 1000; i++) {
//            zmones.remove(0);
//        }
//
//        System.out.println("Viso zmoniu: " + zmones.size());
//        System.out.println("Vidutinis amzius: " + zmones.getVidutinisAmzius());

    }
}
