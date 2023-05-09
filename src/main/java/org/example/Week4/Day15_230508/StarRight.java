package org.example.Week4.Day15_230508;

public class StarRight {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 1; i <= height; i++) { // i부터 height만큼 반복
            for (int j = 0; j < i; j++) { // i일 때 i만큼 반복
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
