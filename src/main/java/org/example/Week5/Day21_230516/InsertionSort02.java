package org.example.Week5.Day21_230516;

import java.util.Arrays;

public class InsertionSort02 {

    public int[] sort(int[] arr, boolean IsAscending) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if ((IsAscending ? arr[j] < arr[j - 1] : arr[j] - arr[j-1] > 0)) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else {
                    break;
                }
//                System.out.printf("i:%d j:%d j-1:%d\n", i, j, j - 1);
            }
        }
        return arr;
    }

    public int[] sort(int[] arr){
        return sort(arr, true);
    }

    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};
        int[] arr2 = {-2, -3, -9, -28, -1};
        System.out.println(Arrays.toString(arr));

        InsertionSort02 sort = new InsertionSort02();
        arr = sort.sort(arr, false);
        System.out.println(Arrays.toString(arr));
        arr = sort.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr2));
        arr = sort.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        arr = sort.sort(arr2, false);
        System.out.println(Arrays.toString(arr2));
    }
}
