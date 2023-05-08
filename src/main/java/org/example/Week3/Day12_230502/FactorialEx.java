package org.example.Week3.Day12_230502;

import java.util.Scanner;

public class FactorialEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt() ;
        int answer = 1;
//        for (int i = input; i >= 1; i--) { // 감소식으로 작성
        for (int i = 1; i <= input; i++) { // 증가식으로 작성
            answer *= i;
//            System.out.println("i = "+i);
//            System.out.println("a = "+answer);
        }
        System.out.println(answer);
    }
}
