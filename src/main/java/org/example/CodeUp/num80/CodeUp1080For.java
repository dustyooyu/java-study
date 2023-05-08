package org.example.CodeUp.num80;

import java.util.Scanner;

public class CodeUp1080For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
//            System.out.printf("i = %d ", i);
//            System.out.printf("sum = %d ", sum);
//            System.out.println();
            if (sum >= input) {
                System.out.printf("%d", i);
                break;
            }
        }
    }
}
// 정수(0 ~ 1000) 1개를 입력받아 1부터 그 수까지 계속 더할 때,
// 그 합이 입력한 정수보다 같거나 작을 때까지 더하고, 마지막에 입력한 정수를 출력
// 55 -> 10, 5 -> 3

