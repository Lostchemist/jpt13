package org.ironhack.bootcamp.jpt13.assessment2.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransformerMain {
    public static void main(String[] args) {
//        input    ["ABCD", "12345", "Hello"], 2
//        output ["BC", "234", "ell"]

        List<String> output = wordTransformation(Arrays.asList("ABCD", "12345", "Hello"), 2);

        assert output.get(0).equals("BC");
        assert output.get(1).equals("234");
        assert output.get(2).equals("ell");
    }

    public static List<String> wordTransformation(List<String> wordList, int nrIterations) {
        /* *** EAT THE ELEPHANT ***
            break it in smaller chunks
            eat each chunk little by little.
         */
        for (int i = 0; i < nrIterations; i++) {
            if (nrIterations % 2 == 0) {
                wordList = removeRightLetters(wordList);
            } else {
                wordList = removeLeftLetters(wordList);
            }
        }

        return wordList;
    }


    private static List<String> removeRightLetters(List<String> inputList) {
        List<String> outputList = new ArrayList<>();
        // YOUR CODE HERE
        return outputList;
    }

    private static List<String> removeLeftLetters(List<String> inputList) {
        List<String> outputList = new ArrayList<>();
        // YOUR CODE HERE
        return outputList;
    }
}
