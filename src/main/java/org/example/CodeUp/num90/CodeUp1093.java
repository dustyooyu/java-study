package org.example.CodeUp.num90;

import java.util.Scanner;

public class CodeUp1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 입력될 값
        int num = 0;
        int[] arr = new int[23];
        for (int i = 0; i < cnt; i++) {
            num = sc.nextInt();
            arr[num-1] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
// 1~23까지 출석번호를 10번 랜덤하게 부를 때, 각 출석번호가 불린 횟수 출력