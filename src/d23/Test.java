package d23;

import java.util.Objects;

public class Test {

    public static void main(String... args) {

        Circle c1 = new Circle(new Point(1, 2), 2);
        Circle c2 = new Circle(new Point(5, 2), 1.5);
        Disaster d1 = new Disaster(new Point(-3, -4), 45, 3, 12);

        // Object[] objs = { c1, c2, d1 };
        // IArea area = c2;

        // double totalArea = bendrasPlotas(1.0, new IArea[] { c1, c2, d1 });
        // double totalArea = bendrasPlotas(1.0, new IArea[] {});
        double totalArea = bendrasPlotas(1.0, c1, c2, d1);
        System.out.println(totalArea);

        System.out.println(bendrasPlotas(1.0));
        System.out.println(bendrasPlotas(1.0, c1));
        System.out.println(bendrasPlotas(1.0, c1, c2));
    }

    // static double bendrasPlotas(double c, IArea[] objs) {
    static double bendrasPlotas(double c, IArea... objs) {
        double total = 0;
        for (IArea area : objs) {
            total += area.getArea();
        }
        return total * c;
    }
}
