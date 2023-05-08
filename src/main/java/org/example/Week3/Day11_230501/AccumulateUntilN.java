package org.example.Week3.Day11_230501;

import java.util.Scanner;

public class AccumulateUntilN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
// 1부터 n번까지의 합 구하기