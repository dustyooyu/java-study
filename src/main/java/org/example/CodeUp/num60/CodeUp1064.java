package org.example.CodeUp.num60;

import java.util.Scanner;

public class CodeUp1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        System.out.printf("%d", (numA < numB ? numA : numB) < numC  ? (numA < numB ? numA : numB) : numC);

//        조금 더 과정이 보이게 적으면 (연산은 동일)
//        int min = numA < numB ? numA : numB;
//        min = min < numC ? min : numC;
//        System.out.println(min);

    }
}
// 입력된 세 정수 a, b, c 중 가장 작은 값을 출력하는 프로그램을 작성해보자.
// 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
// A < B ? A : B -> a
// a < C ? a : C


