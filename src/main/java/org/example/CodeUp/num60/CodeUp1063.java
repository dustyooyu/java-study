package org.example.CodeUp.num60;

import java.util.Scanner;

public class CodeUp1063 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        System.out.printf("%d", numA > numB ? numA : numB);
    }
}
// 입력된 두 정수 a, b 중 큰 값을 10진수로 출력하는 프로그램을 작성해보자.
// 단, 조건문을 사용하지 않고 3항 연산자 ? 를 사용한다.
