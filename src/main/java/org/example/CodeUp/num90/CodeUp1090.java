package org.example.CodeUp.num90;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int term = sc.nextInt();
        int count = sc.nextInt();
        long answer = start;
        int cnt = 1; // 수열의 첫번째수가 이미 있고,

        while (cnt < count){ // cnt가 1부터 1씩 증가해서 n보다 작을 때까지 반복
            answer *= term; // 첫번째수 * 등차하면 수열의 2번째 수부터 누적됨
            cnt++; // 1번째 수열 이미 있고, n-1번 등차 주면 n번째가 됨.
//            System.out.printf("%d,%d,%d ", cnt, count, answer);
        }
        System.out.println(answer);
    }
}



