package e02;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionsStreamsDemo {

    public static void main(String[] args) {

        List<Integer> listas = Arrays.asList(-10, 13, -20, 45, -78, 90, 8, 13);

        listas.stream()
                .filter(x -> x >= 0)
                .filter(x -> x < 90)
                .map(e -> e * 10)
                .sorted((a, b) -> -Integer.compare(a, b))
                .skip(1)
                .forEach(i -> System.out.println(i));

        long count = listas.stream()
                .filter(x -> x >= 0)
                .filter(x -> x < 90)
                .map(e -> e * 10)
                .sorted((a, b) -> -Integer.compare(a, b))
                .skip(1)
                .count();
        System.out.println("count=" + count);

        Set<Integer> naujasListas = listas.stream()
                .filter(x -> x >= 0)
                .filter(x -> x < 90)
                .map(e -> e * 10)
                .sorted((a, b) -> -Integer.compare(a, b))
                .skip(1)
                .collect(Collectors.toSet());
        System.out.println("naujasListas=" + naujasListas);


        List<List<Integer>> listas2 = Arrays.asList(
                Arrays.asList(-10, 13, -20),
                Arrays.asList(45, -78, 90, 8, 13));

        naujasListas = listas2.stream()
                .flatMap(e -> e.stream())
                .map(e -> e * 10)
                .collect(Collectors.toSet());
        System.out.println("naujasListas2=" + naujasListas);
    }
}
