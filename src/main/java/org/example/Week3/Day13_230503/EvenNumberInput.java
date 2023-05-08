package org.example.Week3.Day13_230503;

import java.util.Scanner;

public class EvenNumberInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.println("짝수를 입력하세요.");
            input = sc.nextInt();
        }while (input % 2 != 0);
        System.out.println("짝수가 입력되었습니다.");
    }
}
