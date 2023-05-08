package org.example.CodeUp.num70;

import java.util.Scanner;

public class CodeUp1071While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { // 무한반복문
            int iNum = sc.nextInt();
            if (iNum == 0) { // 입력받은 값이 0일시 break문 실행
                break;
            }
            System.out.println(iNum); // 입력받은 값 출력 반복
        }
    }
}
// -2147483648 ~ +2147483647 범위 정수가 순서대로 입력된다.
// 0이 아니면 입력된 정수를 줄을 바꿔 출력, 0이 입력되면 출력 중단.