package org.example.Week2.Day9_230427;

public class Accumulate687Compound {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        answer += num % 10;  // 나머지 누적 더하기
        System.out.println("answer = " + answer);
        num /= 10; // 몫 저장

        answer += num % 10;
        System.out.println("answer = " + answer);
        num /= 10;

        answer += num % 10;
        System.out.println("answer = " + answer);
    }
}
