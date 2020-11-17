package intro;

public class Rusiavimas {

    public static void main(String[] args) {

        int[] m = { 3, 2, 7, 1 };
        //System.out.println(m);
        spausdintiMasyva(m);

        // { 3, 2, 7, 1 }
        // { 2, 3, 7, 1 }
        // { 1, 3, 7, 2 }

        // { 1, 2, 7, 3 }

        // { 1, 2, 3, 7 }

        // sukeisti masyvo 0 ir 3 elementa vietomis
//        int s = m[0];   // 3
//        m[0] = m[3];    // 1
//        m[3] = s;       // 3

//        sukeistiVietomis(m, 0, 3);
//        //System.out.println(m);
//        spausdintiMasyva(m);

        for (int i = 0; i < m.length - 1; i++) {

            for (int j = i + 1; j < m.length; j++) {

                if (m[i] > m[j]) {
                    sukeistiVietomis(m, i, j);
                    spausdintiMasyva(m, i, j);
                }
            }
        }

        spausdintiMasyva(m);
    }

    static void sukeistiVietomis(int[] p, int x, int y) {
        int s = p[x];
        p[x] = p[y];
        p[y] = s;
    }

    static void spausdintiMasyva(int [] p) {
        System.out.print("{ ");
        for(int e : p) {
            // System.out.print(e + ' '); - klaida, nes char traktuojamas kaip skaicius
            System.out.print(e + " ");
        }
        System.out.println('}');
    }

    static void spausdintiMasyva(int [] p, int x, int y) {
        System.out.print("{");
        for(int i = 0; i < p.length; i++) {
            if (i == x || i == y) {
                System.out.print('*');
            } else {
                System.out.print(' ');
            }
            System.out.print(p[i]);
        }
        System.out.println(" }");
    }


}
