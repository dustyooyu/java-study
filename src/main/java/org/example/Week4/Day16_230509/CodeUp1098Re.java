package org.example.Week4.Day16_230509;

import java.util.Arrays;
import java.util.Scanner;
// OOP로 작성하기

public class CodeUp1098Re {
    // 배열 생성, 막대 놓기, 배열 출력

    private int[][] boardArr; // 멤버변수

    public CodeUp1098Re(int row, int col) { // 생성자를 통해 배열 값
        this.boardArr = new int[row][col];
    }

    // 막대 놓기
    public void setBeam(int length, int direction, int rowX, int colY) {
        if (direction == 0) { // 막대방향 가로
            for (int j = 0; j < length; j++) {
                boardArr[rowX - 1][colY - 1 + j] = 1; // 열 인덱스 변경
            }
        } else { // 막대방향 세로
            for (int j = 0; j < length; j++) {
                boardArr[rowX - 1 + j][colY - 1] = 1; // 행 인덱스 변경
            }
        }
    }

    // 출력하기
    public void printArr() {
        for (int i = 0; i < boardArr.length; i++) {
            for (int j = 0; j < boardArr[0].length; j++) {
                System.out.printf("%d ", boardArr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 입력 - 가로 세로, 막대 개수, 길이 방향 좌표x, 좌표y
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt(); // 격자판 가로
        int col = sc.nextInt(); // 격자판 세로
        int beam = sc.nextInt(); // 막대 개수
        CodeUp1098Re cu1098 = new CodeUp1098Re(row, col);

        for (int i = 0; i < beam; i++) {
            int length = sc.nextInt(); // 막대 길이
            int direction = sc.nextInt(); // 막대 방향 0가로 1세로
            int x = sc.nextInt(); // 막대 행좌표
            int y = sc.nextInt(); // 막대 열좌표
            cu1098.setBeam(length, direction, x, y);
        }
        cu1098.printArr();

    }
}

