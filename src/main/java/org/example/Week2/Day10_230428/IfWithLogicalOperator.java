package org.example.Week2.Day10_230428;

public class IfWithLogicalOperator {
    public static void main(String[] args) {
        int numX = 5;
        int numY = 10;

        if (numX > 0 && numY > 0) {
            System.out.println("x와 y는 모두 양수입니다.");
        }
        if (numX > 0 || numY > 0) {
            System.out.println("x와 y중 적어도 하나는 양수입니다.");
        }
        if (!(numX > 0)) {
            System.out.println("x는 음수 또는 0입니다.");
            //실행되지 않음. x > 0은 true, 그 부정은 false 임으로 실행되지 않는다.
        }
    }
}
