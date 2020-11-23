package d23.uzdavinys;

import java.time.LocalDateTime;

public class PaymentHistory {

    private LocalDateTime date;
    private String bankAccount;
    private double amount;

    public PaymentHistory(LocalDateTime date, String bankAccount, double amount) {
        this.date = date;
        this.bankAccount = bankAccount;
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
