package org.example.CodeUp.num40;

import java.util.Scanner;

public class CodeUp1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.printf("%d", num1 << num2); // num1 * 2^num2 연산된다.
        System.out.printf("%d", sc.nextInt() << sc.nextInt()); // 더 짧게.
    }
}
// 정수 2개 a, b를 입력받아 a * 2^b배 곱해 출력. 비트연산을 이용하도록 하자.