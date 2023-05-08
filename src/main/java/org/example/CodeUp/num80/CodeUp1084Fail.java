package org.example.CodeUp.num80;

import java.util.Scanner;

public class CodeUp1084Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rVal = sc.nextInt();
        int gVal = sc.nextInt();
        int bVal = sc.nextInt();
        int count = 0;
        for (int r = 0; r < rVal; r++) {
            for (int g = 0; g < gVal; g++) {
                for (int b = 0; b < bVal; b++) {
                    System.out.printf("%d %d %d\n", r, g, b);
                    count++;
                }
            }
        }
        System.out.printf("%d", count);
    }
}
// 시간초과