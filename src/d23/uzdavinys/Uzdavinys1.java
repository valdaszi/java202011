package d23.uzdavinys;

public class Uzdavinys1 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setFirstName("Jonas");
        e1.setLastName("Jonaitis");
        e1.setBankAccountNumber("LT1123456789");
        e1.setAmount(1000);

        Employee e2 = new Employee();
        e2.setFirstName("Ona");
        e2.setLastName("One");
        e2.setBankAccountNumber("GB33334444444");
        e2.setAmount(3500.00);

        Client c2 = new Client();
        c2.setName("Microsoft DE");
        c2.setBankAccount("DE23232323232");
        c2.setAmount(-1500.78);

        IPayment[] payments = { e1, c2, e2 };
        Payments.printPaymentInfo(payments);
    }
}
