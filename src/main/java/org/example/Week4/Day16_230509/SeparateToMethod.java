package org.example.Week4.Day16_230509;

import java.util.Arrays;

// 인덱스 값 변경하고, System.out.println(Arrays.toString(arr[0])); 출력 반복
// 리팩토링 - static 메서드로 활용

public class SeparateToMethod {
    public static void printArrays(int[][] arr) { // 인스턴스 생성 필요 없는 스태틱 메서드 생성
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };
        printArrays(arr);

//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));

        arr[0][0] = 0;
        arr[1][1] = 0;
        arr[2][2] = 0;
        printArrays(arr);
    }
}
