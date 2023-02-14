package transactions;

import java.util.ArrayList;
import java.util.Date;

public interface TransactionList {

    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);

    Transaction getTransactionByDate(Date transactionDate);

    ArrayList<Transaction> getAllTransactions();

}
