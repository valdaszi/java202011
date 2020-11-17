package intro;

public class Demo2 {

    public static void main(String[] args) {

//        String[] miestai;
//        miestai = {"Kaunas", "Babtai"};

//        String[] miestai = new String[] {"Kaunas", "Babtai"};

        String[] miestai = {"Kaunas", "Babtai"};


        System.out.println(miestai[1]);

        String[] miestai2;
        int miestuSkaicius = 3; //
        miestai2 = new String[miestuSkaicius];
        System.out.println(miestai2.length);

        if (miestai2[0] == null) {
            System.out.println("Nera miesto!!! " + miestai2[0]);
        } else {
            System.out.println(miestai2[0]);
        }

        miestai2[0] = "Balbieriskis";
        miestai2[1] = "Bezdukiskes";
        miestai2[2] = "Babukiskes";
        if (miestai2[0] == null) {
            System.out.println("Nera miesto!!! " + miestai2[0]);
        } else {
            System.out.println(miestai2[0]);
        }


        int i = 100;
        double k = i / 3;
        System.out.println(k);

        k = (double) i / 3;
        System.out.println(k);
    }
}
