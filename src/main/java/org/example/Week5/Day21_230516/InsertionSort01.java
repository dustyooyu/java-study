package org.example.Week5.Day21_230516;

import java.util.Arrays;

public class InsertionSort01 {
    public static void main(String[] args) {

        int[] arr = {7, 2, 3, 9, 28, 1};
        System.out.println(Arrays.toString(arr));
        // i j j-1
        // 1 1 0
        // 2 2 1
        // 2 1 2 .. 찍어보기
        // i가 n일 때 j는 n부터 순차로 감소하게 만들기
        // j에서 옆칸 비교하기
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }else{
                    break;
                }
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
