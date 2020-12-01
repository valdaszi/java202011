package e01.uzdavinys2;


public class Main {

    public static void main(String[] args) {

        Container<Employee> box = new Container<>();
        box.add(new Employee("B"));
        box.add(new Employee("A"));
        box.add(new Employee("C"));

        for (Employee emp : box.order((e1, e2) -> -e1.getName().compareTo(e2.getName()))) {
            System.out.println(emp);
        }
    }
}
