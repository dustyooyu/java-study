package org.example.Week3.Day12_230502;

public class WhileFactorial {
    public static void main(String[] args) {
        // 5! = 120
        int num = 5;
        int answer = 1;
        while (num > 0) {
           answer *= num--; // num을 5부터 감소하면서.
            System.out.println(answer);
        }
    }
}
