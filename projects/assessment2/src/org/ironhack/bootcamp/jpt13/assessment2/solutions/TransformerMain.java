package org.ironhack.bootcamp.jpt13.assessment2.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TransformerMain {
    public static void main(String[] args) {
//        input    ["ABCD", "12345", "Hello"], 2
//        output ["BC", "234", "ell"]

        List<String> output = wordTransformation(Arrays.asList("ABCD", "12345", "Hello"), 2);

        // Manual validations
        System.out.println(output.get(0).equals("BC") ? "OK" : "should output BC %s".format(output.get(0)));
        System.out.println(output.get(1).equals("234") ? "OK" : "should output 234 %s".format(output.get(1)));
        System.out.println(output.get(2).equals("ell") ? "OK" : "should output ell %s".format(output.get(2)));
    }

    public static List<String> wordTransformation(List<String> wordList, int nrIterations) {
        // iterates nrIterations times the list
        // for each iteration...
        for (int i = 0; i < nrIterations; i++) {
            if (i % 2 == 0) {
                // ... if i is even removes each word first letter
                wordList = removeRightLetters(wordList);
            } else {
                // ... else removes each word last letter
                wordList = removeLeftLetters(wordList);
            }
        }

        return wordList;
    }


    private static List<String> removeRightLetters(List<String> inputList) {
        List<String> outputList = new ArrayList<>();
        for (String word : inputList) {
            outputList.add(word.substring(1));
        }

        return outputList;
    }

    private static List<String> removeLeftLetters(List<String> inputList) {
        List<String> outputList = new ArrayList<>();
        for (String word : inputList) {
            outputList.add(word.substring(0, word.length() - 1));
        }

        return outputList;
    }
}
