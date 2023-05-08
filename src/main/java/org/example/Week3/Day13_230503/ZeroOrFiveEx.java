package org.example.Week3.Day13_230503;

import java.util.Scanner;

public class ZeroOrFiveEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.printf("%d\n", num);

        String flagText = "0 또는 5로만 이루어진 숫자입니다.";
        while (num > 0) {
            if (num % 10 != 5 && num % 10 != 0) {
                flagText = "0 또는 5로만 이루어진 숫자가 아닙니다.";
                break;
            }
            num /= 10;
        }
        System.out.println(flagText);
    }
}
