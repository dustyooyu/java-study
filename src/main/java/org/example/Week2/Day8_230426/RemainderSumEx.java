package org.example.Week2.Day8_230426;

public class RemainderSumEx {
    public static void main(String[] args) {
        int num = 687;
        int firstRemainder = num % 10; // 687을 10으로 나눈 나머지
        num = num / 10; // 687을 10으로 나눈 몫
        int secondRemainder = num % 10; // 68 / 10의 나머지
        int thirdRemainder = num / 10; // 68 / 10의 몫

        System.out.println(firstRemainder + secondRemainder + thirdRemainder);
        System.out.println(firstRemainder);
        System.out.println(secondRemainder);
        System.out.println(thirdRemainder);

    }
}
