package org.example.CodeUp.num40;
import java.util.Scanner;

public class CodeUp1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.printf("%d", num1 % num2);
    }
}
//정수 2개(a, b) 를 입력받아 a를 b로 나눈 나머지를 출력해보자.
//단, 0 <= a, b <= +2147483647, b는 0이 아니다.
//정수 2개(a, b)가 공백을 두고 입력된다. 10 3 -> 1