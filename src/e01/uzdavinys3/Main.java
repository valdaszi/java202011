package e01.uzdavinys3;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Saugykla<Integer> saugykla = new Saugykla<>();
        saugykla.add(100);
        saugykla.add(99);
        saugykla.add(-10);
        saugykla.add(15);

        System.out.println("ta pati tvarka");
        for (Integer i : saugykla.asc()) {
            System.out.println(i);
        }

        System.out.println("atvirkstine tvarka");
        for (Integer i : saugykla.desc()) {
            System.out.println(i);
        }

//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer x) {
//                return x > 0;
//            }
//        };

        System.out.println("filtras: tik teigiami");
//        for (Integer i : saugykla.filter(predicate)) {
//        for (Integer i : saugykla.filter((Integer x) -> { return x > 0; })) {
        for (Integer i : saugykla.filter(x -> x > 0)) {
            System.out.println(i);
        }
    }
}
