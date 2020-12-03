package e02;

import java.util.Arrays;
import java.util.List;

public class StreamDemo4 {

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

        salaries.stream()
                // tarpines operacijos
                .peek(s -> System.out.println("Pries: " + s))
                .sorted((s1, s2) -> Double.compare(s1.getSalary(), s2.getSalary()))

                // galutine operacija yra BUTINA !!!!
                .forEach(e -> System.out.println("Po: " + e));
                ;

    }
}
