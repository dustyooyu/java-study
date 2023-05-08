package org.example.CodeUp.num90;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int multiply = sc.nextInt();
        int plus = sc.nextInt();
        int num = sc.nextInt();
        long answer = start;
        for (int i = 1; i < num ; i++) {
            answer = answer * multiply + plus;
            System.out.printf("i = %d, %d\n", i, answer);
        }
        System.out.printf("%d", answer);
    }
}
