package org.example.opgame.test;
import org.example.opgame.service.OpGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jun
 *
 * 1. 덧셈
 * 2. 기회 3회
 * 3. 격려
 * 4. 결과는 10 이하
 *
 */

public class GameTest {

    @Test
    public void test() {
        OpGame game = new OpGame();
        game.makeQuestion();
        String question = game.getQuestion();

        assertEquals("1 + 1 = ", question);
        assertEquals(3, game.getRemainingAnswers());
        assertEquals(false, game.isAnswer(3));
        assertEquals(2, game.getRemainingAnswers());
        assertEquals("한번 더 해보자", game.getCheeringUpMsg());
        assertEquals(true, game.isAnswer(2));
    }

    @Test
    public void testRandom(){
        System.out.println((int)(Math.random() * 10));
    }

    @Test
    public void testSumMax(){ // max를 정해두고 합이 그 이하인 덧셈 만들기
        int max = 10;
        int a = (int)(Math.random() * max);
        int b = (int)(Math.random() * (max - a)); // b는 a 이하로 만들어짐
        System.out.printf("%d + %d = %d", a, b, a + b);
        assertTrue(a + b < max);
    }

}