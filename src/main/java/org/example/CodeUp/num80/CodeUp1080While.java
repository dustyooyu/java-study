package org.example.CodeUp.num80;

import java.util.Scanner;

public class CodeUp1080While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(); // 입력값
        int sum = 0; // 합
        int i = 0;
        while (sum < input) { // 합계가 입력값보다 작은 동안, (크거나 같으면 중단)
            i++;
            sum += i; // sum = sum + i
            System.out.printf("i = %d ", i);
            System.out.printf("sum = %d \n", sum);
        }
        System.out.println(i);
    }
}

// 정수(0 ~ 1000) 1개를 입력받아 1부터 그 수까지 계속 더할 때,
// 그 합이 입력한 정수보다 같거나 작을 때까지 더하고, 마지막에 입력한 정수를 출력
// 55 -> 10, 5 -> 3

