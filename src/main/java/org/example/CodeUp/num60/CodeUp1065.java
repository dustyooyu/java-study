package org.example.CodeUp.num60;

import java.util.Scanner;

public class CodeUp1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        if (numA % 2 == 0){
            System.out.println(numA);
        }
        if (numB % 2 == 0){
            System.out.println(numB);
        }
        if (numC % 2 == 0){
            System.out.println(numC);
        }
    }
}
// 세 정수 a, b, c가 입력되었을 때, 짝수만 출력해보자.
// 0 ~ +2147483647 범위의 정수들이 입력, 짝수만 순서대로 줄을 바꿔 출력한다.


