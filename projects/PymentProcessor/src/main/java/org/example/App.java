package org.example;

import org.example.model.Account;

import java.math.BigDecimal;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        Account buyer = new Account("Toni Mas", "Calle 1", new BigDecimal(100), 1);
        Account seller = new Account("Toni Mas", "Calle 1", new BigDecimal(100), 1);

        buyer.equals(seller);

        System.out.println(buyer);




        System.out.println( "Hello World!" );
    }
}
