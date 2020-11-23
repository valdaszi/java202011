package d23.uzdavinys;

public interface IPayment {

    String getBankAccountNumber();

    String getBankAccountOwnerName();

    double getAmount();


//    int getHistoryRecordsCount();
//
//    PaymentHistory[] getHistory();
//
//    default PaymentHistory[] getPaymentHistory() {
//        if (getHistoryRecordsCount() == 0) return null;
//        PaymentHistory[] clone = new PaymentHistory[getHistoryRecordsCount()];
//        // System.arraycopy(history, 0, clone, 0, historyRecordsCount);
//        for (int i = 0; i < getHistoryRecordsCount(); i++) {
//            clone[i] = getHistory()[i];
//        }
//        return clone;
//    }

    PaymentHistory[] getPaymentHistory();

    void addPaymentHistory(PaymentHistory paymentHistory);
}
