package org.example.CodeUp.num50;

import java.util.Scanner;

public class CodeUp1059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d", ~sc.nextInt());
    }
}
// 입력 된 정수를 비트단위로 참/거짓을 바꾼 후 정수로 출력해보자. 비트단위(bitwise)연산자 ~