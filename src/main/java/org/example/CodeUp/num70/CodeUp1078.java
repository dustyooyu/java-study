package org.example.CodeUp.num70;

import java.util.Scanner;

public class CodeUp1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("%d", sum);
    }
}
// 정수(1 ~ 100) 1개를 입력받아 0부터 그 수까지 짝수의 합을 구해보자. 반복문 이용
// 1부터 입력된 수까지 짝수의 합을 출력
