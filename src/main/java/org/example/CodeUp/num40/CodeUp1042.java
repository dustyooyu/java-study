package org.example.CodeUp.num40;
import java.util.Scanner;

public class CodeUp1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.printf("%d", num1 / num2);
    }
}
// 정수 2개(a, b) 를 입력받아 a를 b로 나눈 몫을 출력해보자.
// 단, -2147483648 <= a <= b <= +2147483647, b는 0이 아니다.
// 정수 2개(a, b)가 공백을 두고 입력된다. 1 3 -> 0