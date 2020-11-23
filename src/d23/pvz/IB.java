package d23.pvz;

public interface IB {

    double perimeter();

    default void printName() {
        System.out.println("IB");
    }
}
