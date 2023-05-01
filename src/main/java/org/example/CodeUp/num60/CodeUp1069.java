package org.example.CodeUp.num60;

import java.util.Scanner;

public class CodeUp1069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade = sc.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("best!!!");
                break;
            case 'B':
                System.out.println("good!!");
                break;
            case 'C':
                System.out.println("run!");
                break;
            case 'D':
                System.out.println("slowly~");
                break;
            default:
                System.out.println("what?");
        }
    }
}
// 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
// A : best!!!, B : good!!, C : run!, D : slowly~, 나머지 문자들 : what?
// 문자 = 아스키코드 정수이므로 switch의 case값으로 사용가능


