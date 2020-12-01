package e01.uzdavinys2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;

public class Container <E> {

//    static double a = skaitytiIsFailo();
//
//    static {
//        if (Math.random() < 0.5) a = 100;
//        if (Math.random() < 0.5) a *= 2;
//        try {
//            a = skaitytiIsFailo();
//        } catch (Exception e) {
//            a = 0;
//        }
//    }
//
//     1)
    List<E> list = new ArrayList<>();

    // 2)
//    List<E> list;
//
//    public Container() {
//        list = new ArrayList<>();
//    }

//    // 3)
//    List<E> list;
//
//    {
//        //.....
//        list = new ArrayList<>();
//    }

    public void add(E e) {
        list.add(e);
    }

    public List<E> order(Comparator<E> cmp) {
        list.sort(cmp);
        return list;
    }


//    {
//        //.....
//        list = new LinkedList<>();
//    }
//
//    static double skaitytiIsFailo() {
//        //...
//        throw new RuntimeException("Kazkas negerai");
//    }
}
