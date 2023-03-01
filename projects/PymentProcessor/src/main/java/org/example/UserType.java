package org.example;

import java.util.Arrays;

public enum UserType {
    ADMIN("admin", 13),
    REVIEWER("reviewer", 8),
    MODERATOR("moderator", 10),
    USER("user", 2);

    private String alias;

    private int weight;


    UserType(String alias, int weight) {
        this.alias =  alias;
        this.weight = weight;
    }

    public static boolean isStaff(UserType userType) {
        return Arrays.asList(ADMIN, REVIEWER, MODERATOR).contains(userType);
    }

    public boolean isStaff() {
        return Arrays.asList(ADMIN, REVIEWER, MODERATOR).contains(this);
    }


}
