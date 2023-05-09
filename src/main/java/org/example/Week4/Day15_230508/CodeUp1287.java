package org.example.Week4.Day15_230508;


import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan = sc.nextInt();
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < dan * i; j++) { // n단일 때 n * i 출력, 1증가하며 반복
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}


// 2단이면 ** **** ****** 식으로 출력되어야 함.

