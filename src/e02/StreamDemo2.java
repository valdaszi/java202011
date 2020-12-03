package e02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "A"),
                new Employee(10, "V"),
                new Employee(12, "X"),
                new Employee(31, "X"),
                new Employee(41, "A"),
                new Employee(7, "X")
        );

        // suskaiciuoti kiek yra darbuotoju skirtingu vardu
        // Employee -> name (String) -> distinct() -> count()

        long cnt = employees.stream()
                .map(e -> e.getName())
                .peek(e -> System.out.println("1: " + e))
                .distinct()
                .peek(e -> System.out.println("2: " + e))
                .count();
        System.out.println("Viso=" + cnt);


        cnt = employees.stream()
                .map(e -> e.getName())
                .collect(Collectors.toSet())
                .size();


        // Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8).stream() ...
        int total = IntStream.range(1, 11)
                .filter(x -> x % 2 == 0)
                .sum();
        System.out.println("2+4+...+10=" + total);

        total = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(x -> x % 2 == 0)
                .reduce(-10, (x, y) -> {
                    System.out.println("reduce: " + x + "+" + y + "=" + (x + y));
                    return x + y;
                });
        System.out.println("2+4+...+10=" + total);

        // sitaip labai blogai!!!!
        suma = -10;
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> suma += x)
                .count();
        System.out.println("suma=" + suma);


        // Uzdavinys - atspausdinti varda ir kiek darbuotoju yra su tokiu pat vardu
        // Employee -> groupBy Employee.name: Map<String, List<Employee>>

        Map<String, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getName()));
        map.keySet().forEach(e -> {
            System.out.println("Su vardu " + e + " yra darbuotoju " + map.get(e).size());
        });

        employees.stream()
                .collect(Collectors.groupingBy(e -> e.getName()))
                .entrySet()
                .forEach(e -> {
                    System.out.println("Su vardu " + e.getKey() + " yra " + e.getValue().size());
                });


    }
    static int suma;
}
