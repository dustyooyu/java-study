package org.example.CodeUp.num60;

import java.util.Scanner;

public class CodeUp1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        switch (month) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("winter");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("fall");
        }
    }
}
// 월이 입력될 때 월 : 계절 이름 출력
// 12, 1, 2 : winter, 3, 4, 5 : spring,  6, 7, 8 : summer, 9, 10, 11 : fall
// codeup은 case 12, 1, 2 : 형식 지원하지 않음

