package org.example.CodeUp.num40;
import java.util.Scanner;

public class CodeUp1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long lVal = scanner.nextLong();
        System.out.printf("%d", lVal + 1);
    }
}
//정수를 1개 입력받아 1만큼 더해 출력해보자.
//단, -2147483648 ~ +2147483647 의 범위로 입력된다.
//계산되고 난 후의 값의 범위(데이터형)에 주의한다. 2147483647 -> 2147483648

