package org.example.Week3.Day13_230503;

import java.util.Scanner;

public class ProgmFactorM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;

        System.out.printf("%d", answer);
    }

    public int solution(int num) {
        int answer = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}

// 약수의 합 구하기
