package org.example.Week7.Day29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberExTest {

    @Test
    void isPrimeTest() {
//        assertTrue(NumberEx.isPrime(1));
        assertTrue(NumberEx.isPrime(7));
//        assertTrue(NumberEx.isPrime(10));
    }

    @Test
    void testPerpectionNumber(){
        assertTrue(NumberEx.isPerpectionNumber(6));
        assertTrue(NumberEx.isPerpectionNumber(28));
//        assertTrue(NumberEx.isPerpectionNumber(100)); // false
    }

    @Test
    void testFactors(){
        assertEquals("[1, 2, 4, 8]", NumberEx.factors(16));
    }
}