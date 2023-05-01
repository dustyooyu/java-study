package org.example.CodeUp.num110;

import java.util.Scanner;

public class CodeUp1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numX = sc.nextInt();
        int numY = sc.nextInt();

        System.out.printf("%d+%d=%d\n", numX, numY, numX + numY);
        System.out.printf("%d-%d=%d\n", numX, numY, numX - numY);
        System.out.printf("%d*%d=%d\n", numX, numY, numX * numY);
        System.out.printf("%d/%d=%d\n", numX, numY, numX / numY);
    }
}

// 사칙연산 계산기. 두 정수를 입력받아 x+y=5 등 사칙연산 결과를 양식에 맞춰 출력.