package org.example.Week2.Day8_230426;

import java.util.Arrays;

public class TwoDimArrSetValue {
    public static void main(String[] args) {

        //특정 인덱스에 값 각각 할당
        int[][] iArr1 = new int[3][3];
        System.out.println("iArr1 Before");
        System.out.println(Arrays.toString(iArr1[0]));
        System.out.println(Arrays.toString(iArr1[1]));
        System.out.println(Arrays.toString(iArr1[2]));
        // 0으로 초기화된 것 확인
        
        iArr1[0][0] = 1;
        iArr1[1][0] = 2;
        iArr1[0][2] = 3;
        System.out.println("iArr1 After");
        System.out.println(Arrays.toString(iArr1[0]));
        System.out.println(Arrays.toString(iArr1[1]));
        System.out.println(Arrays.toString(iArr1[2]));
        // 지정된 값 잘 들어간 것을 확인

        //전체 값 한번에 할당하기
        int[][] iArr2 = new int[][]{
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        System.out.println("iArr2");
        System.out.println(Arrays.toString(iArr2[0]));
        System.out.println(Arrays.toString(iArr2[1]));
        System.out.println(Arrays.toString(iArr2[2]));
    }
}
