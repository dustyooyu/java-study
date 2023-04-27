package org.example.CodeUp.num50;

import java.util.Scanner;

public class CodeUp1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        System.out.println(iVal1 <= iVal2 ? 1 : 0);
    }
}
// 입력받은 정수 b가 a보다 크거나 같으면 1을, 그렇지 않으면 0을 출력
// -2147483647 <= a, b <= +2147483648