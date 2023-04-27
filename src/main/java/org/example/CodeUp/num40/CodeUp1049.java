package org.example.CodeUp.num40;

import java.util.Scanner;

public class CodeUp1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        System.out.println(iVal1 > iVal2 ? 1 : 0 );
    }
}
// 입력받은 a가 b보다 크면 1을, a가 b보다 작거나 같으면 0을 출력
// 두 정수 a, b가 공백을 두고 입력된다.
// -2147483648 <= a, b <= +2147483647