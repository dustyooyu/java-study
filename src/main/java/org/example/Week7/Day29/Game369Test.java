package org.example.Week7.Day29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Game369Test {

    @Test
    void testgame369() {
        assertEquals("*", Game369.is369(3));
        assertEquals("", Game369.is369(15));
        assertEquals("**", Game369.is369(33));
        assertEquals("***", Game369.is369(333));
        assertEquals("****", Game369.is369(3333));
        //assertEquals : 두 객체의 값이 같은지 여부
    }
}