package d16;

public class Faktorialas {

    public static void main(String[] args) {
        int n10 = faktorialas(10);
        System.out.println("10! = " + n10);
        System.out.println("6! = " + faktorialas(6));
        System.out.println("3! = " + faktorialas(3));
    }


    // n! = 2 * 3 * ... * n
    // n! = n * (n-1) * (n-2) * ... * 2 = n * (n-1)!
//    static int faktorialas(int n) {  // n = 10
//        int f = 1;
//        for (; n >= 2; n--) {
//            f *= n;
//        }
//        return f;
//    }

    static int faktorialas(int n) {  // n = 10
        if (n == 2) return 2;
        return n * faktorialas(n - 1);
    }


//    static int m1() {
//        int x = m2();
//        // ...
//        return x + 1;
//    }
//
//    static int m2() {
//        int x = m1();
//        // ...
//        return x;
//    }

}
