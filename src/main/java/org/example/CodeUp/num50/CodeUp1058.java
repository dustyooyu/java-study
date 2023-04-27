package org.example.CodeUp.num50;

import java.util.Scanner;

public class CodeUp1058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d", num1 == 0 && num2 == 0 ? 1 : 0);
    }
}
// 정수 참1 거짓0 중 두개 입력시 모두 거짓일 때만 참을 출력