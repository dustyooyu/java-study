package org.example.Week2.Day8_230426;

import java.util.Arrays;

public class TenxTenFor {
    public static void main(String[] args) {
        int[][] iArr10x10 = new int[10][10];
        //반복문 for 사용하여 배열 출력하기
        for(int i = 0; i < 10; i++) { // 반복 조건 = i가 10보다 작을 때까지 1씩 증가
            System.out.println(Arrays.toString(iArr10x10[i]));
        }
    }
}
