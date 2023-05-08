package org.example.CodeUp.num70;

import java.util.Scanner;

public class CodeUp1071DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            if (num !=0) {
                System.out.println(num);
            }
        } while (num != 0);
    }
}

// -2147483648 ~ +2147483647 범위 정수가 순서대로 입력된다.
// 0이 아니면 입력된 정수를 줄을 바꿔 출력, 0이 입력되면 출력 중단.