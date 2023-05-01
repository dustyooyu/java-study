package org.example.CodeUp.num10;

import java.util.Scanner;

public class CodeUp1070For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 0; input != 0; i++) { // input이 0이면 반복 종료
            System.out.println(input);
            input = sc.nextInt(); // for문 실행시마다 input 값을 갱신. 없으면 처음 input 값으로 무한루프.
        }
    }
}

// -2147483648 ~ +2147483647 범위 정수가 순서대로 입력된다.
// 0이 아니면 입력된 정수를 줄을 바꿔 출력, 0이 입력되면 출력 중단.

