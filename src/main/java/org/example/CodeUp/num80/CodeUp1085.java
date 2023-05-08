package org.example.CodeUp.num80;

import java.util.Scanner;

public class CodeUp1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hz = sc.nextDouble();
        double bit = sc.nextDouble();
        double track = sc.nextDouble();
        double second = sc.nextDouble();
        double result = hz * bit * track * second / 8 / 1024 / 1024;
        System.out.printf("%.1f MB", result);
    }
}
