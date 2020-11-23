package d23.pvz;

public class C implements IA, IB {

    public double area() {
        return 100;
    }

    public double perimeter() {
        return 55;
    }

    @Override
    public void printName() {
        System.out.println("C");
    }
}


class Main {
    public static void main(String[] args) {

        C c = new C();
        c.printName();
    }
}