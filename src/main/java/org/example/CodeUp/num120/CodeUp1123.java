package org.example.CodeUp.num120;

import java.util.Scanner;

public class CodeUp1123 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%.3f", sc.nextFloat() * 9 / 5 + 32);
    }
}

// 섭씨온도 정수로 입력시 화씨온도로 소수 셋째짜리까지 출력
// 화씨 온도 = 9 / 5 * 섭씨온도 + 32