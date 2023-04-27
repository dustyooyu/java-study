package org.example.CodeUp.num40;

import java.util.Scanner;

public class CodeUp1047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%d", num << 1); // num * 2^1 = num * 2가 연산된다.
    }
}
// 정수 1개를 입력받아 2배 곱해 출력. 비트연산을 이용하도록 하자.