package org.example.Week3.Day12_230502;

public class WhileSum678 {
    public static void main(String[] args) {
        int n = 678;
        int answer = 0;
        while (n > 0) {
            answer += n % 10;
            n = n / 10;
//            System.out.printf("몫 = %d ", n);
//            System.out.printf("합계누적 %d\n", answer);
        }
        System.out.printf("6 + 7 + 8 = %d", answer);
    }
}