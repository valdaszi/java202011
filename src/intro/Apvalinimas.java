package intro;

public class Apvalinimas {

    public static void main(String[] args) {

        double m = Math.PI; //  3.14;

        System.out.println(m); // 3.141592653589793 -> 3.142

        // m: 4.3 4.4 4.0 -> x:4 -  |x - m| <= 0.5
        // m: 3.5 3.7 3.9 -> x:4 -  |x - m| <= 0.5

        System.out.println(Math.floor(3.4 + 0.5));
        System.out.println(Math.floor(2.5 + 0.5));

        System.out.println(Math.floor((m + 0.0005) * 1000.0) / 1000.0);

        double a = 1;
        for (int i = 1; i <= 4; i++) a = a * 10;
        System.out.println(a);

        double b = Math.pow(10.0, 4.0);
        System.out.println(b);
    }

}
