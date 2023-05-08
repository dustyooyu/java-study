package org.example.Week3.Day13_230503;

public class SumOfOdds {
    public static void main(String[] args) {
        int answer = 0;
        int num = 10;
        for (int i = 1; i <= num ; i++) {
            if (i % 2 != 0){
                answer += i;
                System.out.printf("i = %d, answer = %d\n", i, answer);
            }
        }
        System.out.printf("1~%d까지 홀수의 합 = %d", num, answer);
    }
}
