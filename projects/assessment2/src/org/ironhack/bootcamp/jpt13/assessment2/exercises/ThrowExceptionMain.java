package org.ironhack.bootcamp.jpt13.assessment2.exercises;

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
        // here if input is a negative value (less than 0) it should throw a new IllegalArgumentException

        return input*input;
    }
}
