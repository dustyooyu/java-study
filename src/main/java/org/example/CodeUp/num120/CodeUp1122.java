package org.example.CodeUp.num120;

import java.util.Scanner;

public class CodeUp1122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secInput = sc.nextInt();
        int min = secInput / 60;
        int sec = secInput % 60;
        System.out.printf("%d %d", min, sec);
    }
}

// 초를 입력받아 분 초의 형태로 출력하시오.
// 변수 안 쓰고 하는 방법 있을까?