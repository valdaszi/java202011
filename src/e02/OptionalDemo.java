package e02;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class OptionalDemo {

    public static void main(String[] args) {

        List<Integer> listas = Arrays.asList(10, null, 0, 4, 5);

        Optional<Integer> i = rastiPirma(listas, a -> a != null && a < 10 && a > 0 );
        System.out.println(i);

        i = rastiPirma(listas, a -> a != null && a > 100);
        System.out.println(i);

        i = Optional.ofNullable(null);
        System.out.println(i.isEmpty());
    }

    static Optional<Integer> rastiPirma(List<Integer> listas, Predicate<Integer> f) {
        for (Integer i : listas) {
            if (f.test(i)) return Optional.of(i);
        }
        return Optional.empty();
    }


}



