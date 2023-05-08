package org.example.CodeUp.num80;

import java.util.Scanner;

public class CodeUp1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) { // 1부터 n까지
            if (i % 3 == 0) continue; // continue면 건너뛰고 실행
            System.out.printf("%d ", i);
        }
    }
}


