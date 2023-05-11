package org.example.Week4.Day16_230509;

import java.util.Scanner;

public class CodeUp1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = 4;
        for (int i = 0; i < height; i++) {
            System.out.printf(" ");
            for (int j = 0; j < i; j++) {
                System.out.printf("*\n");
            }
        }
    }
}
