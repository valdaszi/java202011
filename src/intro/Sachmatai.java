package intro;

public class Sachmatai {

//    public static void main(String[] args) {
//
//        int grudai = 0;
//
//        // suskaiciuoti kiek grudeliu tilps lentoje
//        int lentosDydis = 16;
//        int x = 1;
//        // for (int i = 0; i < lentosDydis; i++) {
//        for (int i = 1; i <= lentosDydis; i++) {
//            System.out.println("Langelyje " + i + " yra " + x + " grudu");
//            grudai = grudai + x;
//
//            x = x * 2;
//        }
//
//        System.out.println("Viso ant lentos yra " + grudai + " grudu");
//    }


//    public static void main(String[] args) {
//        int grudai = 0;
//        int x = 1;
//
//        for (char stulpelis = 'a'; stulpelis <= 'd' ; stulpelis++) {
//            // System.out.print(stulpelis);
//            for (int eilute = 1; eilute <= 4; eilute++) {
//                // System.out.print(eilute);
//                System.out.println("Langelyje " + stulpelis + eilute + " yra " + x + " grudu");
//                grudai = grudai + x;
//                x = x * 2;
//            }
//            // System.out.println(); // uzbaigiame eilute
//        }
//
//        System.out.println("Viso ant lentos yra " + grudai + " grudu");
//    }

    public static void main(String[] args) {
        int grudai = 0;
        int lentosKrastoDydis = 6; // 3 x 3
        int x = 1;
        //                    97                99
        for (char stulpelis = 'a'; stulpelis <= 'a' + lentosKrastoDydis - 1; stulpelis++) {
            // System.out.print(stulpelis);
            for (int eilute = 1; eilute <= lentosKrastoDydis; eilute++) {
                // System.out.print(eilute);
                System.out.println("Langelyje " + stulpelis + eilute + " yra " + x + " grudu");
                grudai = grudai + x;
                x = x * 2;
            }
            // System.out.println(); // uzbaigiame eilute
        }
        System.out.println("Viso ant lentos yra " + grudai + " grudu");
    }
}

// 1 - 2 - 4 - 8 - 16 - 32 - 64 - ...
