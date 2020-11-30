package d26;

import java.util.ArrayList;
import java.util.List;

public class MusuVeiksmoDemo {

    public static void main(String[] args) {
        new MusuVeiksmoDemo().run();
    }

    void run() {
        List<Integer> skaiciukai = new ArrayList<>();
        skaiciukai.add(100);
        skaiciukai.add(70);
        skaiciukai.add(200);
        skaiciukai.add(50);
        System.out.println(skaiciukai);

        System.out.println(daugyba(skaiciukai, 2));
        System.out.println(daugyba(skaiciukai, -1));
        System.out.println(dalyba(skaiciukai, 2));

        class ManoVeiksmas implements IManoVeiksmas {

            int aaa() {
                return 100;
            }

            @Override
            public int veiksmas(int i) {
                return i + 200;
            }
        }

        System.out.println(manoVeiksmas(skaiciukai, new ManoVeiksmas()));

        class ManoVeiksmas2 implements IManoVeiksmas {

            @Override
            public int veiksmas(int i) {
                return i - 200;
            }
        }
        IManoVeiksmas veiksmas2 = new ManoVeiksmas2();
        System.out.println(manoVeiksmas(skaiciukai, veiksmas2));


        IManoVeiksmas veiksmas3 = new IManoVeiksmas() {
            @Override
            public int veiksmas(int i) {
                return i * 3;
            }
        };
        System.out.println(manoVeiksmas(skaiciukai, veiksmas3));


        System.out.println(manoVeiksmas(skaiciukai, x -> x * 5));
    }

    // Rekomenduojame naudoti standartinius interfeisus:
    // konkreciai cia: Function<Integer, Integer>
    interface IManoVeiksmas {
        int veiksmas(int i);
    }

    List<Integer> manoVeiksmas(List<Integer> src, IManoVeiksmas v) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : src) {
            res.add(v.veiksmas(i));
        }
        return res;
    }

    List<Integer> daugyba(List<Integer> src, int c) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : src) {
            res.add(i * c);
        }
        return res;
    }

    List<Integer> dalyba(List<Integer> src, int c) {
        List<Integer> res = new ArrayList<>();
        for (Integer i : src) {
            res.add(i / c);
        }
        return res;
    }
}


