package org.example.Week2.Day8_230426;

import java.util.Arrays;

public class TwoDimArrEx02 {
    // 메소드를 통해 배열 출력 Refactoring
    public static void printArray(int[][] arr) { // int[][]를 출력할 static 메소드 선언
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("--------------");
    }

    public static void main(String[] args) {
        int[][] iArr1 = new int[3][3];
        System.out.println("iArr1 Before");
        printArray(iArr1);
        // 0으로 초기화

        //특정 인덱스에 값 각각 할당
        System.out.println("iArr1 After");
        iArr1[0][0] = 1;
        iArr1[1][0] = 2;
        iArr1[0][2] = 3;
        printArray(iArr1);

        //전체 값 한번에 할당하기
        int[][] iArr2 = new int[][]{
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        System.out.println("iArr2");
        printArray(iArr2);
    }
}
