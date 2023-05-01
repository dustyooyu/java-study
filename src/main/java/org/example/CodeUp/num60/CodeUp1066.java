package org.example.CodeUp.num60;

import java.util.Scanner;

public class CodeUp1066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();

        if (numA % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (numB % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        if (numC % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
// 세 정수 a, b, c가 입력되었을 때, 짝(even)/홀(odd)을 출력해보자.
// 0 <= a, b, c <= +2147483647, 순서대로 짝(even)/홀(odd)을 줄을 바꿔 출력한다.


