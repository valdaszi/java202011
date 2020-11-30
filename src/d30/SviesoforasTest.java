package d30;

public class SviesoforasTest {

    public static void main(String[] args) {
//        Sviesoforas s1 = new Sviesoforas(52.5, 45.8, new Color(255, 0, 0));
//        Sviesoforas s2 = new Sviesoforas(52.5, 45.8, new Color(200, 10, 10));

        Sviesoforas s1 = new Sviesoforas(52.5, 45.8, Color.RED);
        Sviesoforas s2 = new Sviesoforas(52.5, 45.8, Color.GREEN);
        Sviesoforas s3 = new Sviesoforas(52.5, 45.8, Color.YELLOW);

        System.out.println(Color.RED);

//        Color.red = Color.yellow;
//        System.out.println(Color.red);

//        Color.RED.setR(0);
//        System.out.println(Color.RED);

        s1.setTipas(Tipas.A);
        s3.setTipas(Tipas.C);

//        Tipas.A = Tipas.B;

        // if (s3.getTipas().equals(Tipas.C)) {
        if (s3.getTipas() == Tipas.C) {
            System.out.println("s3 yra tipo C");
        }
    }
}
