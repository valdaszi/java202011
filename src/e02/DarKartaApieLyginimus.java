package e02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class DarKartaApieLyginimus {

    public static void main(String[] args) {

        ManoKlase m1 = new ManoKlase("A");
        ManoKlase m2 = new ManoKlase("A");

        System.out.println(m1 == m2 ? "m1 == m2" : "m1 != m2");

        System.out.println(m1.equals(m2) ? "m1 equals m2" : "m1 !equals m2");
        System.out.println(Objects.equals(m1, m2) ? "m1 equals m2" : "m1 !equals m2");

        ManoKlaseEx x1 = new ManoKlaseEx("A");
        ManoKlaseEx x2 = new ManoKlaseEx("A");

        System.out.println(
                x1 instanceof ManoKlase
                        ? "x1 yra ManoKlase arba vieno is jos vaiku tipo"
                        : "x1 nera ManoKlase arba vieno is jos vaiku tipo");

        ManoKlase m3 = x1;
//        m3.metodasA();
//        x1.metodasA();
        System.out.println(m3.equals(m1) ? "m3 equals m1" : "m3 !equals m1");


        System.out.println(x1 == x2 ? "x1 == x2" : "x1 != x2");
        System.out.println(x1.equals(x2) ? "x1 equals x2" : "x1 !equals x2");
        System.out.println(Objects.equals(x1, x2) ? "x1 equals x2" : "x1 !equals x2");

        Set<ManoKlase> setas = new HashSet<>();
        setas.add(m1);
        setas.add(m2);
        setas.add(m3);
        setas.add(x1);
        setas.add(x2);

        System.out.println("setas dydis: " + setas.size());
    }
}


class ManoKlase {
    private String laukas1;

    public ManoKlase(String laukas1) {
        this.laukas1 = laukas1;
    }

    public String getLaukas1() {
        return laukas1;
    }

    @Override
    public String toString() {
        return "ManoKlase{" +
                "laukas1='" + laukas1 + '\'' +
                '}';
    }

}

class ManoKlaseEx extends ManoKlase {

    public ManoKlaseEx(String laukas1) {
        super(laukas1);
    }

    public void metodasA() {
        //
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ManoKlase manoKlase = (ManoKlase) o;
        return Objects.equals(getLaukas1(), manoKlase.getLaukas1());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLaukas1());
    }

    @Override
    public String toString() {
        return "ManoKlaseEx{" + super.toString() + "}";
    }
}