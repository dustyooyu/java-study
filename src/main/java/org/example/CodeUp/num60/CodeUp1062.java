package org.example.CodeUp.num60;

import java.util.Scanner;

public class CodeUp1062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d", sc.nextInt() ^ sc.nextInt());
    }
}
// 입력된 정수 두 개를 비트단위로 xor 연산한 후 그 결과를 정수로 출력해보자. 3 5 -> 6
