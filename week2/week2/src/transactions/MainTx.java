package transactions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainTx {

    public static void main(String[] args) {
        TransactionList payments = new PaymentList();

        Transaction t1 = new Transaction(1, 2, 100, new Date());
        Transaction t2 = new Transaction(2, 1, 40, new Date(0));
        Transaction t3 = new Transaction(3, 2, 10, new Date(100000));

        SimpleDateFormat sdf = new SimpleDateFormat();


        Date d = new Date();

        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDay());

//        payments.addTransaction(t1);
//        payments.addTransaction(t2);
//        payments.addTransaction(t3);
//
//        payments.getLastTransaction();
//
//        payments.getTransactionByDate(new Date());
    }
}
