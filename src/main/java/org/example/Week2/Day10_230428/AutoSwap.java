package org.example.Week2.Day10_230428;

import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {
        int[] arr = new int[] {2, 1, 7, 9};
        System.out.println(Arrays.toString(arr));
        // 오름차순 정렬을 위해 두 값 비교 후 자리 바꾸기
        boolean check = arr[0] > arr[1];
        if (check) {
            int tmp = arr[0];
            arr[0] = arr[1];
            arr[1] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
