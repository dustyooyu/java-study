package org.example.CodeUp.num30;

import java.util.Scanner;

public class CodeUp1034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int octal = Integer.parseInt(scanner.next(), 8);
        System.out.printf("%d", octal);
    }
}
//8진수로 입력된 정수 1개를 10진수로 바꾸어 출력해보자. 13 -> 11