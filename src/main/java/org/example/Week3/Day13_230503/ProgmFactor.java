package org.example.Week3.Day13_230503;

import java.util.Scanner;
public class ProgmFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                answer += i;
//                System.out.printf("%d %d\n", i, answer);
            }
        }
        System.out.printf("%d", answer);
    }
}

// 약수의 합 구하기
