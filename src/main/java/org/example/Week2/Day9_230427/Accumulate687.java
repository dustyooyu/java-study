package org.example.Week2.Day9_230427;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        answer = answer + num % 10; // 687을 10으로 나눈 나머지, 7을 저장
        System.out.println("answer = " + answer);
        num = num / 10; // 몫 68 저장

        answer = answer + num % 10; // 68 % 10의 나머지 8 -> 7 + 8;
        System.out.println("answer = " + answer);
        num = num / 10; // 몫 60 저장

        answer = answer + num % 10; // 15 + 6
        System.out.println("answer = " + answer);
    }
}
