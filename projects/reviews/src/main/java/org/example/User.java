package org.example;

import java.util.Arrays;
import java.util.List;

/**
 * User rules:
 *  -- username cannot be null nor empty
 *  -- password must contain numbers and letters
 */
public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        boolean hasNumber = hasNumber(password);
        if (!hasNumber) {
            throw new IllegalArgumentException("password must have at least a numeric character");
        }
        this.password = password;
    }

    private boolean hasNumber(String password) {
        List numbers = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
        Boolean hasNumber = false;
        for (char x : password.toCharArray()) {
            hasNumber = hasNumber || numbers.contains(x);
        }

        return hasNumber;
    }
}
