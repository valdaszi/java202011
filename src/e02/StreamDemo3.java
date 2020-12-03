package e02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo3 {

    public static void main(String[] args) {

        List<Salary> salaries = Arrays.asList(
                new Salary(new Employee(1, "A1"), 100.),
                new Salary(new Employee(2, "A2"), 200.),
                new Salary(new Employee(1, "A1"), 300.),
                new Salary(new Employee(2, "A2"), 200.),
                new Salary(new Employee(2, "A2"), 300.),
                new Salary(new Employee(3, "A3"), 400.),
                new Salary(new Employee(4, "A4"), 500.),
                new Salary(new Employee(5, "A5"), 600.),
                new Salary(new Employee(6, "A6"), 800.)
        );

        // Isvesti kiek ir kokiam darbuotojui ismoketa mazejimo tvarka
        salaries.stream()
//                .sorted((d1, d2) -> {
//                    if (d1.getSalary() < d2.getSalary()) return 1;
//                    else if (d1.getSalary() > d2.getSalary()) return -1;
//                    return 0;
//                })
                .sorted((d1, d2) -> -Double.compare(d1.getSalary(), d2.getSalary()))
                .forEach(d -> System.out.println(d.getEmployee().getName() + " " + d.getSalary()));


        // Isvesti Kiek ismoketa viso pinigu kiekvienam darbuotojui ismokejimu mazejimo tvarka
        Map<Employee, List<Salary>> map = salaries.stream()
                .collect(Collectors.groupingBy(s -> s.getEmployee()));
        System.out.println(map);

        Map<Employee, Double> map2 = salaries.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getEmployee(),
                        Collectors.reducing(0.0,
                                (Salary s) -> s.getSalary(),
                                (suma, e) -> {
                                    System.out.println(suma + " + " + e + " = " + (suma + e));
                                    return suma + e;
                                })));
        System.out.println(map2);


        Map<Employee, A> map3 = salaries.stream()
                .collect(
                        Collectors.groupingBy(s -> s.getEmployee(),
                                Collectors.reducing(new A(),
                                        (Salary s) -> new A(s.getSalary()),
                                        (suma, e) -> {
                                            A result = new A();
                                            result.d1 = suma.d1 + e.d1;
                                            result.d2 = suma.d2 + e.d2;
                                            System.out.println(suma + " + " + e + " = " + result);
                                            return result;
                                        })));
        System.out.println(map3);

    }
}

class A {
    double d1;
    double d2;

    public A() {}

    public A(double x) {
        if (x < 500) d1 = x;
        else d2 = x;
    }

    @Override
    public String toString() {
        return "A{" +
                "d1=" + d1 +
                ", d2=" + d2 +
                '}';
    }
}
