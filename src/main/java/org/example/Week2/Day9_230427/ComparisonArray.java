package org.example.Week2.Day9_230427;

import java.util.Arrays;

public class ComparisonArray {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 7, 9 };
        System.out.println(Arrays.toString(arr));
        System.out.printf("%d > %d --> %b \n", arr[0], arr[1], arr[0] > arr[1]);
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
        System.out.println(Arrays.toString(arr));
    }
}
