package org.example;

import org.example.model.Account;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MapsMain {

    public static void main(String[] args) {
        Map<String, User> users = new HashMap<>();

        User u1 = new User("Toni", "1234", UserType.USER);
        User u2 = new User("Juan", "qwert", UserType.ADMIN);
        User u3 = new User("Pedro", "secret", UserType.MODERATOR);
        User u4 = new User("Luis", "nolose", UserType.USER);


        users.put(u1.getUsername(), u1);
        users.put(u2.getUsername(), u2);
        users.put(u3.getUsername(), u3);
        users.put(u4.getUsername(), u4);


        users.get(u1.getUsername());


        for (String key: users.keySet()) {
            if (key == "x") {
                User user = users.get(key);
            }
        }

        for (User user: users.values()) {
           //
        }

        Map<String, Account> accounts = new HashMap<>();

        accounts.put("1l", new Account("savings", "c 1", new BigDecimal(1000), "1l"  ));
        accounts.put("2l", new Account("savings", "c 2", new BigDecimal(1000), "2l"  ));
        accounts.put("3l", new Account("savings", "c 3", new BigDecimal(1000), "3l"  ));
        accounts.put("4l", new Account("savings", "c 4", new BigDecimal(1000), "4l"  ));
        accounts.put("5l", new Account("savings", "c 5", new BigDecimal(1000), "5l"  ));


//        accounts.get("8l").getAddress();


        accounts.forEach((k, v) -> System.out.println("key: " + k + " value: " + v));




    }
}
