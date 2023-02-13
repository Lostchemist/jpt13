package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortArrayTest {

    private int[] arr;

    @BeforeEach
    public void setup() {
        arr = getBaseArray();
    }

    @DisplayName("Validates that a sorted keeps sorted")
    @Test
    public void testSortsASortedArrayProperly() {
        int[] expected = {1,2,4};

        SortArray sortener = new SortArray();
        int[] res = sortener.sort(arr);

        for (int i = 0; i < expected.length ; i++) {
            assertEquals(expected[i], res[i]);
        }
    }

    @Test
    public void testSortsArrayProperly() {
        int[] arr = {1, 4, 2};
        int[] expected = {1,2,4};

        SortArray sortener = new SortArray();
        int[] res = sortener.sort(arr);

        for (int i = 0; i < expected.length ; i++) {
            assertEquals(expected[i], res[i]);
        }
    }

    @Test
    public void testSortsInverseSortedArrayProperly() {
        int[] arr = {4, 2, 1};
        int[] expected = {1,2,4};

        SortArray sortener = new SortArray();
        int[] res = sortener.sort(arr);

        for (int i = 0; i < expected.length ; i++) {
            assertEquals(expected[i], res[i]);
        }
    }

    private int[] getBaseArray() {
        int[] base = {4, 2, 1};

        return base;
    }
}
