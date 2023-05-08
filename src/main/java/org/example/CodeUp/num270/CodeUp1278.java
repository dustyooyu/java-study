package org.example.CodeUp.num270;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        while (n > 0){
            n /= 10; // n = n /10의 몫만 저장됨. 몫이 0이 될 때까지 반복.
            cnt++;
            System.out.println(n);
        }
        System.out.println(cnt);
    }
}
