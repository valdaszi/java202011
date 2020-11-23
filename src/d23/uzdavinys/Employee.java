package d23.uzdavinys;

public class Employee implements IPayment  {

    private String firstName;
    private String lastName;
    private String bankAccountNumber;
    private double amount;

    private PaymentHistory[] history = new PaymentHistory[100];
    private int historyRecordsCount = 0;

    // ...

    @Override
    public String getBankAccountOwnerName() {
        return firstName + " " + lastName;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }


    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public PaymentHistory[] getPaymentHistory() {
        if (historyRecordsCount == 0) return null;
        PaymentHistory[] clone = new PaymentHistory[historyRecordsCount];
        // System.arraycopy(history, 0, clone, 0, historyRecordsCount);
        for (int i = 0; i < historyRecordsCount; i++) {
            clone[i] = history[i];
        }
        return clone;
    }

    public void addPaymentHistory(PaymentHistory paymentHistory) {
        history[historyRecordsCount] = paymentHistory;
        historyRecordsCount++;
    }
}
