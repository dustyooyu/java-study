package org.example.CodeUp.num80;

import java.util.Scanner;
public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hVal = sc.nextInt(16); // int값 입력받고 16진수 지정
            for (int i = 1; i < 16; i++) { // 곱하기 1부터 15까지
                System.out.printf("%X*%X=%X\n", hVal, i, hVal * i);
            }
        }
    }
// A~F까지 입력된 16진수 1~F까지 곱한 구구단, 결과도 16진수로 줄바꿔 출력
