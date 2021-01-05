package com.king;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void messageTest(){
        Main m = new Main();
        assertEquals("Hello laksys!", m.getMessage("laksys"));
    }
    @Test
    public void testAgain(){
        Main m = new Main();
        assertEquals("Please provide a name", m.getMessage(null));
    }

    @Test
    public void testTest(){
        Main m = new Main();
        assertEquals("Please provide a name", m.getMessage(""));
    }
}
