package org.example.CodeUp.num50;

import java.util.Scanner;

public class CodeUp1050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        System.out.println(iVal1 == iVal2 ? 1 : 0);
    }
}
// 입력받은 정수 a와 b가 같으면 1을, 같지 않으면 0을 출력하는 프로그램을 작성해보자.
// -2147483648 <= a, b <= +2147483647