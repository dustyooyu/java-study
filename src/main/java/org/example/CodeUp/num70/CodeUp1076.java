package org.example.CodeUp.num70;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        for (char c = 'a'; c <= input; c++) {
            System.out.printf("%c ", c);
        }
    }
}

// 영문자(a ~ z) 1개가 입력되었을 때 그 문자까지의 알파벳을 순서대로 출력해보자.
// a부터 입력한 문자까지 순서대로 공백을 두고 출력한다.
// while문으로 작성 다시