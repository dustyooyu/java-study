package org.example.Week3.Day11_230501;

public class MultiplicationTable3 {
    public static void printDan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * i);
        }
        System.out.println("---------------");
    }

    public static void main(String[] args) {
        printDan(2);
        printDan(4);
        printDan(8);
        printDan(9);
    }
}
