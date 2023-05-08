package org.example.CodeUp.num70;

import java.util.Scanner;

public class CodeUp1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { // 무한반복
            char ch = sc.next().charAt(0); // 입력된 문자 하나 받아오기
            System.out.println(ch); // 출력하기
        if (ch == 'q') // 위 코드 실행 후 조건 확인
            break; // 빠져나가기
        }
    }
}

// 원하는 문자 입력될 때까지 입력한 여러 문자를 계속 출력하는 프로그램
// 문자들 1개씩 계속 입력하면, 'q'가 입력될 때까지 문자를 줄바꿔 출력한다
