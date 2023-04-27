package org.example.CodeUp.num50;

import java.util.Scanner;

public class CodeUp1056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 != num2){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
// 정수 참1 거짓0 중 두개 입력시 서로 다를 때만 참을 출력