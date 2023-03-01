package org.ironhack.bootcamp.jpt13.assessment2.solutions;

public class ThrowExceptionMain {
    public static void main(String[] args) {
        try {
            positiveMultiplier(-3);
        } catch (IllegalArgumentException e){
            System.out.println("This message should appear if all ok");
        }

        try {
            positiveMultiplier(3);
        } catch (IllegalArgumentException e){
            System.err.println("Something is wrong, you shouldn't see this message");
        }
    }


    public static int positiveMultiplier(int input) {
        if (input < 0) {
            throw new IllegalArgumentException("Input must be a positive integer");
        }

        return input*input;
    }
}
