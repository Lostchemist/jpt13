package transactions;

import java.util.Date;

public class Transaction {

    private long sellerAccountNumber;
    private long buyerAccountNumber;
    private double amount;
    private Date date;

    public Transaction() {}
    public Transaction(long sellerAccountNumber, long buyerAccountNumber, double amount, Date date) {
        setSellerAccountNumber(sellerAccountNumber);
        this.buyerAccountNumber = buyerAccountNumber;
        this.amount = amount;
        this.date = date;
    }

    public long getSellerAccountNumber() {
        return sellerAccountNumber;
    }

    public void setSellerAccountNumber(long sellerAccountNumber) {
        if (sellerAccountNumber < 0) {
            this.sellerAccountNumber = 1;
        } else {
            this.sellerAccountNumber = sellerAccountNumber;
        }
    }

    public long getBuyerAccountNumber() {
        return buyerAccountNumber;
    }

    public void setBuyerAccountNumber(long buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
