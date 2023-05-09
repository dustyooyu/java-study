package org.example.Week4.Day15_230508;

import java.util.Scanner;

public class CodeUp1256Repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int star = sc.nextInt();
        // 반복문 활용 반복 출력
        for (int i = 0; i < star; i++) {
            System.out.printf("*");
        }
        System.out.println("\n\"*\".repeat(3)");
        // repeat써보기
        System.out.printf("*".repeat(3));

    }
}

