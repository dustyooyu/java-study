package org.example.Week3.Day13_230503;

import java.util.Scanner;

public class IsPrime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors = 0;
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) { // 나누어 떨어지는지 확인
                factors += 1;
                break;
            }
        }
        System.out.println(factors == 0 ? num + "은(는) 소수입니다." : num + "은(는) 소수가 아닙니다.");
    }
}
