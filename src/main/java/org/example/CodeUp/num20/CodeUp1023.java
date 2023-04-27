package org.example.CodeUp.num20;

import java.util.Scanner;
import java.util.Arrays;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] splitInput = str.split("\\.");
        int integerPart = Integer.parseInt(splitInput[0]);
        int decimalPart = Integer.parseInt(splitInput[1]);
        System.out.println(integerPart);
        System.out.println(decimalPart);
    }
}
// split 이용하여 구분자 "."를 기준으로 나누어 숫자 출력하기.
