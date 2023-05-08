package org.example.CodeUp.num90;

import java.util.Scanner;

public class CodeUp1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); // 격자판 가로
        int colunm = sc.nextInt(); // 격자판 세로
        int board[][] = new int[row][colunm]; // 격자판

        int stick = sc.nextInt(); // 막대기 개수
        for (int i = 0; i < stick; i++) { // 막대기 개수만큼 반복
            int length = sc.nextInt(); // 막대 길이
            int direction = sc.nextInt(); // 막대 방향 0가로 1세로
            int rowX = sc.nextInt(); // 막대 행좌표
            int rowY = sc.nextInt(); // 막대 열좌표
            if (direction == 0) { // 막대 방향이 가로
                for (int j = 0; j < length; j++) {
                    board[rowX-1][rowY-1+j] = 1;
                }
            } else {
                for (int j = 0; j < length; j++) {
                    board[rowX-1+j][rowY-1] = 1;
                }
            }
        } // for문 끝
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colunm; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
