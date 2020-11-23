package d23.uzdavinys;

import java.time.LocalDateTime;

public class Uzdavinys2 {

    public static void main(String[] args) {

        Client c1 = Client.fromNameAndBankAccount("Microsoft DE", "DE23232323232");
        c1.setAmount(-1500.78);

        c1.addPaymentHistory(new PaymentHistory(
                LocalDateTime.of(2020, 11, 15, 10, 15),
                "DE222222222222",
                1500
        ));
        c1.addPaymentHistory(new PaymentHistory(
                LocalDateTime.of(2020, 11, 19, 15, 00),
                "DE23232323232",
                1250.00
        ));


        Employee e1 = new Employee();
        e1.setFirstName("Jonas");
        e1.setLastName("Jonaitis");
        e1.setBankAccountNumber("LT1123456789");
        e1.setAmount(1000);
        e1.addPaymentHistory(new PaymentHistory(
                LocalDateTime.of(2020, 11, 19, 15, 10),
                "LT1123456789",
                500.00
        ));

        Payments.printMostActive(new IPayment[] { c1, e1 });
    }
}
