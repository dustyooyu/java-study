package org.example.Week5.Day20_230515;

import java.util.Arrays;

public class BubbleEx2 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { // 0~5까지
            for (int j = i + 1; j < arr.length; j++) { // 1~6까지
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
//                System.out.println("i: " + i + ", j: " + j + " " + Arrays.toString(arr));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleEx2 bubble2 = new BubbleEx2();
        int[] arr = {7, 2, 3, 9, 28, 1};
        System.out.println("정렬 전 " + Arrays.toString(arr));
        arr = bubble2.sort(arr);
        System.out.println("정렬 후 " + Arrays.toString(arr));
    }
}



