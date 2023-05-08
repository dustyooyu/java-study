package org.example.CodeUp.num70;

import java.util.Scanner;

public class CodeUp1072 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()]; // 첫줄에 입력된 정수 값이 배열의 길이로 지정됨
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt(); // 입력된 정수 각각 인덱스에 저장
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // 인덱스에 저장된 값 줄바꿔 출력
        }
    }
}

// n개의 정수가 순서대로 입력된다. -2147483648 ~ +2147483647,
// 첫 줄에 정수의 개수 n이 입력되고, (n의 최대 개수 알 수 없음)
// 두 번째 줄에 n개의 정수가 공백을 두고 입력된다. n개의 입력된 정수를 순서대로 줄바꿔 출력.