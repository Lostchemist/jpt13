package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {
        Author a = new Author();
        a.setName("JKkkkkkkkkkk");
        assertTrue(5<a.getName().length());
        assertTrue( true );
    }
}
