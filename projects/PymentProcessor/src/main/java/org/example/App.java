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
//        Account buyer = new Account("Toni Mas", "Calle 1", new BigDecimal(100), 1);
//        Account seller = new Account("Toni Mas", "Calle 1", new BigDecimal(100), 1);
//
//        buyer.equals(seller);

//        System.out.println(buyer);
        User user1 = new User ("admin", "changethispassword", UserType.ADMIN);
        UserType userType = UserType.USER;
        UserType userType1 = UserType.valueOf("ADMINinstrador");


        UserType.isStaff(user1.getUserType());
        user1.getUserType().isStaff();
        UserType.ADMIN.isStaff();

        if (userType == UserType.ADMIN) {
            System.out.println("This user is an admin");
        } else {
            System.out.println("This user is a regular");
        }


        if (userType1 == UserType.USER) {
            System.out.println("This user is a regular");
        } else {
            System.out.println("This user is an admin");
        }

        switch (userType1) {
            case USER:
                System.out.println("This user is a regular");
                break;
            case ADMIN:
                System.out.println("This user is an admin");
                break;
        }

    }
}
