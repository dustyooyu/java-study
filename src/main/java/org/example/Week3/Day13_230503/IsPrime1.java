package org.example.Week3.Day13_230503;

import java.util.Scanner;

public class IsPrime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int factors = 0;
        for (int i = 2; i < num; i++) { // 1~n까지
//        for (int i = 2; i <= num / 2; i++) { // n/2까지
//        for (int i = 2; i * i <= num; i++) { // 루트 n까지
            if (num % i == 0) {
                factors++;
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
        System.out.printf("factors: %d개\n", factors);
        System.out.println(factors == 0 ? num + "은(는) 소수입니다." : num + "은(는) 소수가 아닙니다.");
    }
}
