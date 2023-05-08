package org.example.CodeUp.num90;

import java.util.Scanner;

public class CodeUp1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 ; j++) {
            arr[i][j] = sc.nextInt();
            }
        }

        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < 19; j++) {
                arr[x-1][j] = arr[x-1][j] == 0 ? 1 : 0;
            }
            for (int j = 0; j < 19; j++) {
                arr[j][y-1] = arr[j][y-1] == 0? 1 : 0;
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19 ; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
