package org.example.CodeUp.num80;

import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= m; i++) {
                System.out.printf("%d %d\n", j, i);
            }
        }
    }
}

// 주사위 2개의 면의 개수 n, m이 공백을 두고 입력된다. 1~10 이하 자연수
// 그 합이 입력한 정수보다 같거나 작을 때까지 더하고, 마지막에 입력한 정수를 출력
// 나올 수 있는 주사위의 숫자를 한 세트씩 줄을 바꿔 모두 출력한다.
// 첫 번째 수는 n, 두 번째 수는 m으로 고정해 출력하도록 한다.
