package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testDecodeVowels() {
        assertEquals("answer", App.decodeVowels("1nsw2r"));
    }

    @Test
    public void testDecodeConsonants() {
        assertEquals("jcgevzu", App.decodeConsonants("hbfetyu"));
    }
}
