package d17;

public class Main {

    public static void main(String[] args) {

        Zmogus z;
        z = new Zmogus();
        z.pavarde = "Jonaitis";
        z.vardas = "Jurgis";

        Zmogus z2 = z;
        System.out.println(z2.vardas);

        z2.vardas = "Petras";
        System.out.println(z.vardas);

    }
}
