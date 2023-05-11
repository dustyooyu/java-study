package org.example.Week4.Day16_230509;

import java.util.Scanner;

public class StarPyramidRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = 5;
        // n단 역피라미드
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

        // n단 역피라미드 - 증가식.
        for (int i = 0; i < height; i++) { // 층만큼 반복
            System.out.printf("i = %d\n", i);
            for (int j = 0; j < i; j++) {
                System.out.printf("X\n"); //
                System.out.printf("i = %d, j = %d ", i, j);
            }
            for (int j = 1; j < height * 2 - i * 2; j++) {
                System.out.printf("*");
                System.out.printf("j2:%d ", j);

            }
            System.out.println();
        }
    }
}

