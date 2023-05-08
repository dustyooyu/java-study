package org.example.Week3.Day13_230503;

import java.util.Scanner;

public class ZeroOrFiveExMethod {
    public static boolean isZeroOrFive(int num) { // boolean 타입 메서드
        while (num > 0) {
            if (num % 10 != 5 && num % 10 != 0) {
                return false;
            }
            num /= 10; // num을 나눈 값이 5나 0이 아니면 실행
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean answer = isZeroOrFive(num);
        System.out.printf("%d -> 5와 0으로만 구성된 숫자인가요? %b\n", num, answer);
    }
}
