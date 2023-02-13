package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathLibraryTests {

    @Test
    public void add_twoPositiveInts_Summed(){
        MathLibrary math = new MathLibrary();
        assertEquals(2, math.add(1, 1));
        assertEquals(18, math.add(3, 15));
        assertEquals(298, math.add(152, 146));
    }

    @Test
    public void add_twoNegativeInts_Summed() {
        MathLibrary math = new MathLibrary();
        assertEquals(-2, math.add(-1, -1));
        assertEquals(-18, math.add(-3, -15));
        assertEquals(-298, math.add(-152, -146));
    }

    @Test
    public void add_NegativeAndPositiveInts_Summed() {
        MathLibrary math = new MathLibrary();
        assertEquals(0, math.add(-1, 1));
        assertEquals(-12, math.add(3, -15));
        assertEquals(-6, math.add(-152, 146));
    }

    @Test
    void add() {
        MathLibrary math = new MathLibrary();
        assertEquals(0, math.add(-1, 1));
    }

}
