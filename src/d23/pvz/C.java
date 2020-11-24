package d23.pvz;

public class C implements IA, IB {

    public double area() {
        return 100;
    }

    public double perimeter() {
        return 55;
    }

    @Override
    public void printName() {
        System.out.println("C");
    }

    public void metodasKurisNiekoNegrazina() {
        System.out.println("Cia metodasKurisNiekoNegrazina");
        //
        if (Math.random() < 0.5) return;
        //
        //
        System.out.println("O cia metodasKurisNiekoNegrazina pabaiga");
        return;
    }

    public int metodasKurisGrazinaIntegeri() {
        System.out.println("Cia metodasKurisGrazinaIntegeri");
        //
        if (Math.random() < 0.5) return 1;
        //
        //
        System.out.println("O cia metodasKurisGrazinaIntegeri pabaiga");
        return 2;
    }
}


class Main {
    public static void main(String[] args) {

        C c = new C();
        c.printName();

        c.metodasKurisNiekoNegrazina();

        c.metodasKurisGrazinaIntegeri();
        int x = c.metodasKurisGrazinaIntegeri();

        System.out.println("Pabaiga");
    }
}