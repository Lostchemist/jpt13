package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void newValidUser(){
        User user = new User("admin", "_change1_this_");

        assertNotNull(user.getUsername());
        List numbers = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');
        Boolean hasNumber = false;
        for (char x : user.getPassword().toCharArray()) {
            hasNumber = hasNumber || numbers.contains(x);
        }
        assertTrue(hasNumber);

    }

    @Test
    void newUserNullUsername() {
        User user = new User();

        assertNotNull(user.getUsername());
    }

    @Test
    void newUserEmptyUsername() {
        User user = new User("", "1234");

        assertNotEquals("", user.getUsername());
    }

    @Test
    void newUserPasswordOnlyLetters() {
        assertThrows(IllegalArgumentException.class, () -> { User user = new User("admin", "abc"); } );
    }

    @Test
    void userUpdatePasswordOnlyLetters() {
        User user = new User("admin", "abc1234");
        assertThrows(IllegalArgumentException.class, () -> { user.setPassword("abc"); } );
    }

}
