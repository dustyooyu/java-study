package org.example.Week5.Day20_230515;

import java.util.Arrays;

public class BubbleEx {
    public int[] sortAround(int[] arr, int until) {
        for (int i = 0; i < until; i++) {
            if (arr[i] > arr[i + 1]) {
                int tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
            }
            System.out.println("i "+i +Arrays.toString(arr));
        }
        System.out.println("----------------------");
        return arr;
    }

    public int[] sort(int[] arr){
        for (int j = 1; j <= arr.length; j++) {
            arr = sortAround(arr, arr.length - j);
            System.out.println("j "+j +Arrays.toString(arr));
            System.out.println("----------------------");        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleEx bubble = new BubbleEx();
        int[] arr = new int[]{7, 2, 3, 9, 28, 4};
        System.out.println("정렬 전 " + Arrays.toString(arr));
        arr = bubble.sort(arr);
        System.out.println("정렬 후 " + Arrays.toString(arr));
    }
}



