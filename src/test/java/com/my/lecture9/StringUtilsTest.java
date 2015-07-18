package com.my.lecture9;

import org.junit.Test;

import java.io.IOException;

public class StringUtilsTest {

    @Test
    public void testException() {
        try {
            testLengthLong(null);
        } catch (IOException ioe) {
            System.out.println("2222-------------------------");
        } catch (NullPointerException e) {
            System.out.println("1111-------------------------");
            throw new RuntimeException(e);
        } finally {
            System.out.println("3333-------------------------");
        }
    }

    public int testLengthLong(String str) throws IOException {
        int x = testLength(str);
        System.out.println("+++++++long");
        return x;
    }

    public int testLength(String str) throws IOException {
        int x = str.length();
        System.out.println("+++++++length");
        return x;
    }



}