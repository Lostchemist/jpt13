package transactions;

import java.util.ArrayList;
import java.util.Date;
public class PaymentList implements TransactionList{

    private ArrayList<Transaction> transactions;
    private Account account;

    public PaymentList() {
        transactions = new ArrayList<>();
        account = new Account();
    }

    @Override
    public Transaction getLastTransaction() {
        return transactions.get(transactions.size()-1);
    }

    @Override
    public void addTransaction(Transaction transaction) {
        if (transaction.getBuyerAccountNumber() == account.getAccountNumber()) {
            account.setBalance(account.getBalance() - transaction.getAmount());
            transactions.add(transaction);
        } else if (transaction.getSellerAccountNumber() == account.getAccountNumber()) {
            account.setBalance(account.getBalance() + transaction.getAmount());
            transactions.add(transaction);
        } else {
            System.err.println("This transaction is not related to this account");
        }

    }

    @Override
    public Transaction getTransactionByDate(Date transactionDate) {
        Transaction foundTx = null;
        for(Transaction transaction : transactions) {
            if (transaction.getDate().equals(transactionDate)) {
                foundTx = transaction;
            }
        }
        return foundTx;
    }

    @Override
    public ArrayList<Transaction> getAllTransactions() {
        return transactions;
    }

}
