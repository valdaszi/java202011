package intro;

/*
 Cia demo klase
 */
public class Demo1 {

    public static void main(String[] arg) {

        System.out.println("Lio \n lio");  // String
        System.out.println("Alio \u2655");
        System.out.println(123 + 1000); // int
        System.out.println(2 * 3.1415); // double
        System.out.println(123 > 1000); // boolean
        System.out.println('A');        // char      'A' != "A"

        int i = 640000000;
        System.out.println(i);
        double x = 0.000002;
        float y = 0.01f + 10;

        long big = 12345678900L + 123;
        short s = 6400;

        System.out.println(big);

        char c = '\u2654';
        System.out.println(c);

        if (s < 1000 && c >= 'B' || big != 0) {
            System.out.println("Aha");
        } else {
            System.out.println("Ahh");
            System.out.println("B...");
            System.out.println("C...");
        }

        if (s == 6400) {
            System.out.println("Turim");
        }

        int suma = 0;
        for (int j = 1; j <= 10; j++) {
            suma = suma + j;
        }
        System.out.println("1+2+3+4+...+10=" + suma);

    }

}
