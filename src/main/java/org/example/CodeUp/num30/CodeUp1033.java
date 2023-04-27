package org.example.CodeUp.num30;

import java.util.Scanner;

public class CodeUp1033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iVal = scanner.nextInt();
        System.out.printf("%X", iVal);

        //toUpperCase 사용해보기
        String hexStr = Integer.toHexString(iVal).toUpperCase();
        System.out.printf("%s", hexStr);

        System.out.printf("%s", Integer.toHexString(iVal).toUpperCase());

        //변수 이름 명확하게 짓기
        int iDecimal = scanner.nextInt();
        String hexadecimal = Integer.toHexString(iDecimal);
        System.out.println(hexadecimal.toUpperCase());
    }
}
