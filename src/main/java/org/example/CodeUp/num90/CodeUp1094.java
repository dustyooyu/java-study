package org.example.CodeUp.num90;

import java.util.Scanner;

public class CodeUp1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); // 입력될 값
        int num = 0;
        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            num = sc.nextInt();
            arr[i] = num;
        }
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
// 1~23까지 출석번호를 10번 랜덤하게 부를 때, 각 출석번호 부른 순서 역순으로 출력