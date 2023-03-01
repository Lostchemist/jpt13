package org.ironhack.bootcamp.jpt13.assessment2.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordMultipleMain {

    public static void main(String[] args) {
//        input: ["a", "b", "a", "c", "b"];
//        output: {"a": true, "b": true, "c": false];

        List<String> wordInput = Arrays.asList("a", "b", "a", "c", "b");
        Map<String, Boolean> output = wordMultiple(wordInput);

        System.out.println(output.get("a") ? "OK" : "Should be true");
        System.out.println(output.get("b") ? "OK" : "Should be true");
        System.out.println(output.get("c") ? "Should be false" : "OK");

    }


    public static Map<String, Boolean> wordMultiple(List<String> wordList) {
        Map<String, Boolean> output = new HashMap<>();

        for (String word : wordList) {
            int count = countWords(wordList, word);
            output.put(word, count >1);
        }
        return output;
    }


    private static int countWords(List<String>wordList, String word) {
        int wordCount = 0;

        for (String testWord: wordList) {
            if (word.equals(testWord)) {
                wordCount++;
            }
        }

        return wordCount;
    }

}
