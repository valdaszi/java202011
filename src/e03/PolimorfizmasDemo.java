package e03;

public class PolimorfizmasDemo {

    public static void main(String[] args) {
        T t1;
        t1 = new T();  System.out.println("m1()=" + t1.m1() + ", f=" + t1.f); // 30, 10
        t1 = new V1(); System.out.println("m1()=" + t1.m1() + ", f=" + t1.f); // 31, 10
        t1 = new V2(); System.out.println("m1()=" + t1.m1() + ", f=" + t1.f); // -9, 10
        V2 v2 = new V2(); System.out.println("m1()=" + v2.m1() + ", f=" + v2.f); // -9, 12
    }
}

class T {
    public int f = 10;
    public int m1() { return m2() + m3(); }
    public int m2() { return f; }
    public int m3() { return 20; }
}

class V1 extends T {
    public int f = 11;
    // public int m1() { return m2() + m3(); }
    public int m2() { return f; }
    // public int m3() { return 20; }
}

class V2 extends V1 {
    public int f = 12;
    public int m1() { return m2() - m3(); }
    // public int m2() { return f; }
    // public int m3() { return 20; }
}