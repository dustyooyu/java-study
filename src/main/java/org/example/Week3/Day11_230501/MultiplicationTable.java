package org.example.Week3.Day11_230501;

public class MultiplicationTable {
    public static void main(String[] args) {
        // 2부터 18까지 2의 배수를 출력
        for (int i = 1; i <= 9; i++) {
            System.out.printf("2 * %d = %d\n", i, i * 2);
        }
        System.out.println("------------------");

        // 2단부터 4단까지 동시출력
        for (int j = 2; j <= 4; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n", j, i, j * i);
            }
            System.out.println("---------------");
        }
    }
}
