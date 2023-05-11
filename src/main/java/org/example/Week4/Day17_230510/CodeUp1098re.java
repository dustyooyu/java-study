package org.example.Week4.Day17_230510;


import java.util.Arrays;
import java.util.Scanner;

// 세로h 가로w, 막대수n, 길이l 방향d 0가로 1세로 좌표 x, y
public class CodeUp1098re {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[][] board = new int[h][w];

        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            for (int j = 0; j < l; j++) { // 길이 기준으로
                if (d == 0) { // 가로일 때
                    board[x][y + j] = 1; // 열 방향으로 길이만큼 놓기
                } else { // 세로면
                    board[x + j][y] = 1;
                }
            }
        }
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
