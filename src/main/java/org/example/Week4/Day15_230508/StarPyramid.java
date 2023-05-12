package org.example.Week4.Day15_230508;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = 5;
        // n단 피라미드
        for (int i = 1; i <= height; i++) { // i는 1부터 층수될 때까지 +1며 반복
            for (int j = 0; j < height - i; j++) { // i일 때 왼쪽공백은 0부터 높이-i보다 작을 때까지 공백반복출력
                System.out.printf(" ");            // j가 증가할 수록 반복출력 횟수는 줄어든다.
            }
            for (int j = 2; j < i * 2 + 1; j++) { // i일 때 *은 홀수개로 증가. 2 * i + 1씩. 반복횟수 증가.
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

