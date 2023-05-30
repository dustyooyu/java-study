package org.example.Week7.Day29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void checkLeafYear() {
        assertEquals(false, LeapYear.checkLeapYear(1700));
    }
    @Test
     void testLeafYear() {
        assertEquals(true, LeapYear.isLeapYear(2020));
        assertEquals(false, LeapYear.isLeapYear(1900));
        assertEquals(true, LeapYear.isLeapYear(2400));

    }
}
