package org.example.CodeUp.num80;

import java.util.Scanner;

public class CodeUp1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int term = sc.nextInt();
        int count = sc.nextInt();
        int answer = start;
        for (int i = 1; i < count; i++) {
            answer += term;
            System.out.printf("i.%d, %d\n", i, answer);
        }
        System.out.println(answer);
    }
}



