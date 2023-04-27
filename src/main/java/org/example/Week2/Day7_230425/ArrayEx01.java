package org.example.Week2.Day7_230425;

import java.util.Arrays;
public class ArrayEx01 {
    public static void main(String[] args) {

        int[] iArr1; // int형 배열 선언
        iArr1 = new int[3]; // 배열 길이를 3으로 초기화. 이때 값은 0.
        System.out.println("iArr1 hash = " + iArr1);
        System.out.println("iArr1 = " + Arrays.toString(iArr1));
        iArr1[0] = 0;
        iArr1[1] = 1;
        iArr1[2] = 2;
        System.out.println("iArr1 = " + Arrays.toString(iArr1)); // 값 지정 후 배열 값 조회

        int[] iArr2 = new int[]{4, 5, 6}; // 선언과 동시에 값을 지정해 초기화한다.
        System.out.println("iArr2 = " + Arrays.toString(iArr2));
    }
}