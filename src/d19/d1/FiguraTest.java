package d19.d1;

public class FiguraTest {

    public static void main(String[] args) {

        // Figura f1 = new Figura(2, 5, 90); - negalima nes Figura yra abstrakti klase
        Apskritimas a1 = new Apskritimas(0, 0, 10);
        Apskritimas a2 = new Apskritimas(10, 15, 10);
        Staciakampis s1 = new Staciakampis(30, 30, 45, 10, 20);
        Kvadratas k1 = new Kvadratas(50, 50, 180, 10);

        Figura[] figuros = { a1, a2, s1, k1 };
        System.out.println("Bendras plotas=" + bendrasPlotas(figuros));
        System.out.println("Bendras perimetras=" + bendrasPerimetras(figuros));
    }

    private static double bendrasPerimetras(Figura[] figuros) {
        double perimetras = 0;
        for (Figura f : figuros) {
            perimetras += f.perimetras();
        }
        return perimetras;
    }

    private static double bendrasPlotas(Figura[] figuros) {
        double plotas = 0;
        for (Figura f : figuros) {
            plotas += f.plotas();
        }
        return plotas;
    }
}
