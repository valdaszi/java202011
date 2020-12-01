package e01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemo {

    public static void main(String[] args) {

        List<Integer> listas = Arrays.asList(122, 91, 88, 151, 1000);

        for (Integer i : listas) {
            System.out.println(i);
        }

        System.out.println();

        for (Integer i : filtras(listas, (Integer i) -> { return i % 2 == 0; })) {
            System.out.println(i);
        }

        System.out.println();

        for (Integer i : filtras(listas, i -> i % 2 != 0)) {
            System.out.println(i);
        }

        System.out.println();
        listas.stream().filter(x -> x < 100).forEach(System.out::println);

    }

    static Iterable<Integer> filtras(List<Integer> list, Predicate<Integer> f) {
        return new Iterable<Integer>() {

            public Iterator<Integer> iterator() {

                List<Integer> lyginiai = new ArrayList<>();
                for (Integer i : list) {
                    if (f.test(i)) lyginiai.add(i);
                }

                return lyginiai.iterator();
            }

        };
    }
}
