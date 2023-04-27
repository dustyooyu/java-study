package org.example.Week2.Day8_230426;

import java.util.Arrays;

public class SwapEx {
    public static void main(String[] args) {
//      오름차순으로 정렬하기 - 일일이 값을 교환해서 정리하기
        int[] arr = {2, 1, 4, 8, 7, 6};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        temp = arr[3];
        arr[3] = arr[5];
        arr[5] = temp;
        System.out.println(Arrays.toString(arr));

        // Arrays.sort(); 오름차순 정렬 메서드 이용하기
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


    }
}
