package org.example.CodeUp.num90;

import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] arr = new int[cnt];
        for (int i = 0; i < arr.length; i++) { // 입력한 값으로 배열 채우기
            arr[i] = sc.nextInt();
        }
        // 정렬하기
        for (int i = 0; i < arr.length - 1; i++) { // 인덱스 0~n-1칸. 비교시 좌
            for (int j = i + 1; j < arr.length; j++) { // 인덱스 1~n칸. 비교시 우
                if (arr[i] > arr[j]) { // 왼쪽 값을 오른쪽 값과 비교해서 왼쪽이 더 크면
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; // i와 j의 자리 바꿈.
                }
            }
        }
        System.out.printf("%s", arr[0]);
    }
}
// 1~23까지 출석번호를 10번 랜덤하게 부를 때, 가장 작은 수 출력하기