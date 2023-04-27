package org.example.Week1.Day5_230421;

public class PointTest {
    public static void main(String[] args) {
        // 0, 0의 점 만들기
        Point p1 = new Point(); // Point의 인스턴스화, p1 선언.
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x: %d, y: %d\n", p1.x, p1.y);
        System.out.printf("xy가 같은지? %s\n", p1.isSameXy());
        //Point 클래스 내의 메서드 isSameXy 호출.

        // 다른 점 찍기
        Point p2 = new Point(); // 반복해서 인스턴스 생성할 수 있다.
        p2.x = 1;
        p2.y = 1;
        System.out.printf("x: %d, y: %d\n", p2.x, p2.y);
        System.out.printf("xy가 같은지? %s\n", p2.isSameXy());

        // 다른 점 찍기
        Point p3 = new Point();
        p3.x = 2;
        p3.y = 3;
        System.out.printf("x: %d, y: %d\n", p3.x, p3.y);
        System.out.printf("xy가 같은지? %s\n", p3.isSameXy());

    }// main 끝
}