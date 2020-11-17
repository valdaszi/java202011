package d16;

public class DaugybosLentele {

    public static void main(String[] args) {
        // paprastaLentele();
        // lentele4x2();
        universaliLentele(3);
    }

    static void paprastaLentele() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " +
                        (i * j < 10 ? " " : "") + i * j);
            }
            System.out.println();
        }
    }

    static void lentele4x2() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.print(j + " x " + i + " = " +
                        (i * j < 10 ? " " : "") + i * j + "   ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 2; i <= 9; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "   ");
            }
            System.out.println();
        }
    }

    static void universaliLentele(int stulpeliuSkaicius) {
        //TODO parasyti universalia funkcija
        // 3: 2-3-4 5-6-7 8-9 = 3
        // 4: 2-3-4-5 6-7-8-9 = 2
        // 5: 2-3-4-5-6 7-8-9 = 2
        int maxX = 8 / stulpeliuSkaicius;
        if (8 % stulpeliuSkaicius > 0) maxX++;

        for (int x = 1; x <= maxX; x++) {
            //...
        }
    }
}
