package org.example.Week4.Day15_230508;

public class SpaceInvadersTest { // 클래스
    public static void main(String[] args) { // 메인메서드
        SpaceInvaders si = new SpaceInvaders(); // SpaceInvaders의 인스턴스 객체 생성
        si.moveLeft(); // SpaceInvaders의 메서드 실행
        si.moveLeft();
        si.moveRight();
        System.out.println(si.location); // SpaceInvaders의 멤버변수 접근
    }
}
// -1 두번, +1 한번 이동 수행.
