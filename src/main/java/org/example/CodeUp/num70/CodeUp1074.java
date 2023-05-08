package org.example.CodeUp.num70;

import java.util.Scanner;

public class CodeUp1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while ( 0 < input) {
            System.out.println(input--); // 입력받은 값 출력 반복
        }
    }
}
// 정수(1 ~ 100) 1개가 입력되었을 때 카운트다운을 출력해보자. 1~100, 줄 바꾸며 출력.
// while(조건)
