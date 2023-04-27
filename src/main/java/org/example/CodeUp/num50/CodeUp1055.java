package org.example.CodeUp.num50;

import java.util.Scanner;

public class CodeUp1055 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d", num1 == 1 || num2 == 1 ? 1 : 0);
    }
}
// 정수 참1 거짓0 중 두개 입력시 하나라도 참인 경우 참1, 아니면 거짓0 출력