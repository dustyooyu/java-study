package org.example.Week4.Day17_230510;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1097re {

    public static void main(String[] args) throws IOException {

        // 바둑알 놓기
        int[][] board = new int[19][19];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 19; i++) {
            String[] line = br.readLine().split(" "); // 한 줄을 받아와 공백기준으로 쪼개 배열에 넣음
            for (int j = 0; j < 19; j++) {
                board[i][j] = Integer.parseInt(line[j]);
            }
        }
        // 뒤집기 횟수 입력
        int count = Integer.parseInt(br.readLine());
        // 좌표 입력
        for (int i = 0; i < count; i++) { // 뒤집을 횟수만큼 좌표 받기
            String[] location = br.readLine().split(" "); // 공백자 기준으로 분리해서 입력될 것
            int x = Integer.parseInt(location[0]) - 1;
            int y = Integer.parseInt(location[1]) - 1;

            for (int j = 0; j < 19; j++) board[x][j] = board[x][j] == 1 ? 0 : 1; // 1이면 0, 아니면 1로.
            for (int j = 0; j < 19; j++) board[j][y] = board[j][y] == 1 ? 0 : 1;
        }
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}


