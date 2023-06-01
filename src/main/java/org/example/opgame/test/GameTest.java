package org.example.opgame.test;

import org.example.opgame.service.IOperator;
import org.example.opgame.service.OpGame;
import org.example.opgame.service.PlusOperatorLevelOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author jun
 * <p>
 * 1. 덧셈
 * 2. 기회 3회
 * 3. 격려
 * 4. 결과는 10 이하
 */

public class GameTest {

    @Test
    public void test() {
        OpGame game = new OpGame(new PlusOperatorLevelOne());
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
    public void testRandom() {
        System.out.println((int) (Math.random() * 10));
    }

    @Test
    public void testPlus() { // max를 정해두고 합이 그 이하인 덧셈 만들기
        int max = 10;
        int a = (int) (Math.random() * max);
        int b = (int) (Math.random() * (max - a)); // b는 a 이하로 만들어짐
        System.out.printf("%d + %d = %d", a, b, a + b);
        assertTrue(a + b < max);
    }

    @Test
    public void testMinus() { // 두 수 뺄셈 값이 음수가 되지 않도록
        int max = 10;
//        int a = (int) (Math.random() * max);
//        int b = (int) (Math.random() * a);  // 랜덤 생성된 실수에 a만큼 곱하여 생성
        int a = (int) (Math.random() * max);
        int b = (int) (Math.random() * max);
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        } // a < b면 자리 바꾸기
        System.out.printf("%d - %d = %d", a, b, a - b);
        assertTrue(a - b >= 0);
    }
}
