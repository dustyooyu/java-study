package org.example.Week3.Day11_230501;

public class ForLoopForward {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // 초기화식; 조건식; 증감식;
            System.out.println(i); // println 이용, 개행하여 출력
        } // 중괄호 안의 코드가 for문 조건에 따라 반복 실행된다.
        // 0~4까지 출력
        System.out.println("----------------");

        for (int i = 10; i > 0; i--) {
            System.out.printf("%d", i);  // printf 이용, 개행하지 않고 연속적으로 출력
            // -- 감소식 이용, 10~1까지 역순 출력
        }
        System.out.println();
        System.out.println("----------------");

        for (int i = 2; i < 10; i += 2) { // i가 2부터 10미만까지 2씩 증가, 짝수출력
            System.out.printf("%d", i);
        }
        System.out.println();
        System.out.println("----------------");
        for (int i = 1; i < 10; i += 2) { // i가 1부터 10미만까지 3씩 증가, 홀수출력
            System.out.printf("%d", i);
        }
    }
}