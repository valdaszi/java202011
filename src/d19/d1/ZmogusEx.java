package d19.d1;

import d17.Zmogus;

import java.time.LocalDate;

public class ZmogusEx extends Zmogus {

    private LocalDate gimimoData;
    private int age;

    public ZmogusEx(String vardas, String pavarde, LocalDate gimimoData) {
        super(vardas, pavarde);
        // this.gimimoData = gimimoData;
        // this.age = LocalDate.now().getYear() - gimimoData.getYear();
        setGimimoData(gimimoData);
    }

    public int getAge() {
        return age;
    }

    public LocalDate getGimimoData() {
        return gimimoData;
    }

    public void setGimimoData(LocalDate gimimoData) {
        this.gimimoData = gimimoData;
        this.age = LocalDate.now().getYear() - gimimoData.getYear();
    }
}

class ZmogusTest {
    public static void main(String[] args) {
        ZmogusEx z = new ZmogusEx("Ana", "Marija",
                LocalDate.of(2000, 12, 15));
        System.out.println(z.getGimimoData() + ", amzius=" + z.getAge());

        z.setGimimoData(LocalDate.of(2010, 12, 15));
        System.out.println(z.getGimimoData() + ", amzius=" + z.getAge());

        spausdintiInfo(z);
        spausdintiInfo(new Zmogus("Jonas", "Jonaitis"));

        Zmogus zm = z;
        System.out.println(zm.getClass().getName());
    }

    static void spausdintiInfo(Zmogus z) {
        System.out.println(z.vardas + " " + z.pavarde +
                " " + (z instanceof ZmogusEx ? ((ZmogusEx) z).getGimimoData() : ""));
    }
}

