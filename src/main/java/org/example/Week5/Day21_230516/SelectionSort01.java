package org.example.Week5.Day21_230516;

import java.util.Arrays;

public class SelectionSort01 {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        System.out.println(Arrays.toString(arr));

        for (int j = 0; j < arr.length - 1; j++) { // 0부터 마지막 인덱스까지 반복
            int targetValue = arr[j];
            int targetIndex = j;
            for (int i = j + 1; i < arr.length; i++) { // 목표값 바꾼 다음 값부터
                if (targetValue > arr[i]) {
                    targetValue = arr[i];
                    targetIndex = i;
                }
            }
            int tmp = arr[j];
            arr[j] = arr[targetIndex];
            arr[targetIndex] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

