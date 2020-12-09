package e08_09;

public class ExceptionDemo2 {

    public static void main(String[] args) {
        test(new int[] { -3, 3, 4, 2 });
        test(new int[] {2});
        test(new int[] {});
        test(null);
    }

    static void test(int[] masyvas) {
        try {
            System.out.println("Max reiksme = " + ManoMath.max(masyvas));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 }

 class ManoMath {

     static int max(int[] masyvas) {
         try {
             // if (masyvas.length == 0) throw new TusciasMasyvas();
             int x = masyvas[0];
             for (int i = 1; i < masyvas.length; i++) {
                 if (x < masyvas[i]) {
                     x = masyvas[i];
                 }
             }
             return x;

         } catch (NullPointerException e) {
             throw new NeteisingiDuomenys(e);

         } catch (Exception e) {
             throw new SkaiciavimoKlaida(e);
         }
     }
 }

// class TusciasMasyvas extends RuntimeException {
// }

class ManoMathKlaida extends RuntimeException {
    public ManoMathKlaida(Throwable cause) {
        super(cause);
    }
}

class NeteisingiDuomenys extends ManoMathKlaida {
    public NeteisingiDuomenys(Throwable cause) {
        super(cause);
    }
}

class SkaiciavimoKlaida extends ManoMathKlaida {
    public SkaiciavimoKlaida(Throwable cause) {
        super(cause);
    }
}
