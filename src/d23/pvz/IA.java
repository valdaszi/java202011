package d23.pvz;

public interface IA {

    double area();

    default void printName() {
        System.out.println("IA");
    }
}
