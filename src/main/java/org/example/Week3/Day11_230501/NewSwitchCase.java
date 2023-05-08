package org.example.Week3.Day11_230501;

import java.util.Scanner;
public class NewSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 12, 1, 2 -> System.out.println("겨울");
            case 3, 4, 5 -> System.out.println("봄");
            case 9, 10, 11 -> System.out.println("가을");
            default -> System.out.println("해당하는 계절이 없습니다.");
        }
    }
}
