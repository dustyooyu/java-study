package org.example.Week4.Day15_230508;

public class SpaceInvaders { // 클래스
    int location; // 멤버변수 선언. 클래스의 '상태'

    public void moveLeft() { // 메소드 선언. 위치값 -1을 수행. 클래스의 '동작'1
        location = location - 1;
    }

    public void moveRight() { // 메소드 선언. 위치값 +1을 수행. 클래스의 '동작'2
        location = location + 1;
    }
}
