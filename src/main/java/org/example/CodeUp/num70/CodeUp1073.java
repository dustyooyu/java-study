package org.example.CodeUp.num70;

import java.util.Scanner;

public class CodeUp1073 {
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
// 0이 아니면 입력된 정수를 출력하고, 0이 입력되면 출력을 중단해보자.
// 정수가 순서대로 입력된다. -2147483648 ~ +2147483647, 단 개수는 알 수 없다.
// 입력된 정수를 줄을 바꿔 하나씩 출력하는데, 0이 입력되면 종료한다. (0은 출력하지 않는다.)
