package org.example.Week3.Day14_230504;

import java.util.Arrays;

public class GetMax {
    public static void main(String[] args) {
        int[] arr = new int[] {2 , 1 , 31 , 9, 7};
        int targetValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (targetValue < arr[i])  targetValue = arr[i];
        }
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("Max = " + targetValue);
    }
}
