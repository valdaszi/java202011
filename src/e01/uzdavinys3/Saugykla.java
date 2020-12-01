package e01.uzdavinys3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Saugykla <E> {

    private List<E> listas = new ArrayList<>();

    public void add(E e) {
        listas.add(e);
    }

    public Iterable<E> asc() {
        return listas;
    }

    // A B C
    // A
    // B A
    // C B A
    public Iterable<E> desc() {
        List<E> d = new ArrayList<>();
        listas.forEach(e -> d.add(0, e));
        return d;
    }

    public Iterator<E> descIt() {
        List<E> d = new ArrayList<>();
        listas.forEach(e -> d.add(0, e));
        return d.iterator();
    }


    public Iterable<E> filter(Predicate<E> f) {
        List<E> d = new ArrayList<>();
        listas.forEach(e -> {
            if (f.test(e)) {
                d.add(e);
            }
        });
        return d;
    }

}
