package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void testDecodeVowels() {
        assertEquals("answer", app.decodeVowels("1nsw2r"));
    }

    @Test
    public void testDecodeConsonants() {
        assertEquals("jcgevzu", app.decodeConsonants("hbfetyu"));
    }
}
