package org.example.CodeUp.num120;

import java.util.Scanner;

public class CodeUp1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNumX = sc.nextInt();
        int iNumY = sc.nextInt();
        int iNumZ = sc.nextInt();

        System.out.printf("%.2f", (iNumX + iNumY + iNumZ) / 3.0);
    }
}

// 세 정수가 입력되면 평균을 출력하시오. 소수둘째자리까지.