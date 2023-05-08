package org.example.CodeUp.num80;

import java.util.Scanner;

public class CodeUp1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width = sc.nextDouble();
        double high = sc.nextDouble();
        double bit = sc.nextDouble();
        double result = width * high * bit / 1024 / 1024 / 8;
        System.out.printf("%.2f MB", result);
    }
}
