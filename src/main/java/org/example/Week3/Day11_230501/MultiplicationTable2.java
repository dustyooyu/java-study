package org.example.Week3.Day11_230501;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        int[] dan = {2, 4, 8, 9}; // 출력할 특정 단만 배열에 입력
        for (int j = 0; j < dan.length; j++) { // 배열의 길이 이용
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n", dan[j], i, i * dan[j]);
            }
            System.out.println("----------");
        }
    }
}
// 연속되지 않은 단을 선택적으로 출력