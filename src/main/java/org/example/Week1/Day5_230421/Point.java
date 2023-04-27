package org.example.Week1.Day5_230421;
public class Point {
    int x;
    int y;
    boolean isSameXy() { //메서드 추가
        return x == y;
    }
}
// x, y는 정수형 변수, 클래스의 멤버변수이다.
// 만약 변수타입앞에 접근제어자 private을 붙이면 같은 클래스 내에서만 접근 가능. PointTest에서 위 변수에 접근할 수 없다.
