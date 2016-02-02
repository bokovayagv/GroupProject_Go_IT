package com.ozerian.finalProject;

import org.junit.Test;

import java.util.function.IntBinaryOperator;

import static org.junit.Assert.*;

public class ConverterTest {
    private int integer;
    private String binary;

    @Test
    public void testToBinary() throws Exception {
        integer=-1579;
        String expectedValue = Integer.toBinaryString(integer);
        char[] expectedChars = expectedValue.toCharArray();
        String actualValue = Converter.toBinary(integer);
        char[] actualChars = actualValue.toCharArray();
        assertArrayEquals(expectedChars, actualChars);
    }


    @Test
    public void testToInteger() throws Exception {
        binary = "011010111010111010111";
        int result = Integer.parseInt(binary, 2);
        String expectedValue = String.valueOf(result);
        char[] expectedChars = expectedValue.toCharArray();
        String actualValue = Converter.toInteger(binary);
        char[] actualChars = actualValue.toCharArray();
        assertArrayEquals(expectedChars, actualChars);

    }
}