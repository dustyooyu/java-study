package org.example.Week2.Day8_230426;

import java.util.Arrays;

public class TwoDimArrEx04 {
    public static void fillARow(int[][] arr, int rowNum){
        arr[rowNum][0] = 1;
    }

    public static class printTwoArr {
    }

    public static void main(String[] args) {

        //가로한줄 채우기
        int[][] iArr1 = new int[5][5];
        iArr1[2][0] = 1; // 2행 0열
        iArr1[2][1] = 1;
        iArr1[2][2] = 1;
        iArr1[2][3] = 1;
        iArr1[2][4] = 1;

        System.out.println("iArr1 Arrays[5][5] 3번째 행 채우기");
        System.out.println(Arrays.toString(iArr1[0]));
        System.out.println(Arrays.toString(iArr1[1]));
        System.out.println(Arrays.toString(iArr1[2]));
        System.out.println(Arrays.toString(iArr1[3]));
        System.out.println(Arrays.toString(iArr1[4]));
        System.out.println();

        // 세로 한 줄 채우기
        iArr1[0][2] = 2;
        iArr1[1][2] = 2;
        iArr1[2][2] = 2;
        iArr1[3][2] = 2;
        iArr1[4][2] = 2;

        System.out.println("iArr1 Arrays[5][5] 3번째 열 채우기");
        System.out.println(Arrays.toString(iArr1[0]));
        System.out.println(Arrays.toString(iArr1[1]));
        System.out.println(Arrays.toString(iArr1[2]));
        System.out.println(Arrays.toString(iArr1[3]));
        System.out.println(Arrays.toString(iArr1[4]));
    }
}
