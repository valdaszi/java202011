package d17;

public class Zmogus {

    public String vardas; // = null
    public String pavarde; // = null

    Zmogus() {
        System.out.println("Kvieciamas default konstructorius");
    }

    Zmogus(String vardas, String pavarde) {
//        if (vardas == null) {
//            // klaida
//            // System.err.println("Nenurodytas vardas");
//            throw new RuntimeException("Nenurodytas vardas");
//
//        } else {
//            this.vardas = vardas;
//            this.pavarde = pavarde;
//        }
        this(vardas);
        this.pavarde = pavarde;
    }

    Zmogus(String vardas) {
//        if (vardas == null || vardas.length() == 0) {
//            // klaida
//            // System.err.println("Nenurodytas vardas");
//            throw new RuntimeException("Nenurodytas vardas");
//
//        } else {
//            this.vardas = vardas;
//        }
        patikrintiVarda(vardas);
        this.vardas = vardas;
    }

    void patikrintiVarda(String vardas) {
        if (vardas == null || vardas.length() == 0) {
            // klaida
            // System.err.println("Nenurodytas vardas");
            throw new RuntimeException("Nenurodytas vardas");
        }
    }
}
