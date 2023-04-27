package org.example.CodeUp.num40;
import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iVal1 = scanner.nextInt();
        int iVal2 = scanner.nextInt();
        System.out.printf("%d\n", iVal1 + iVal2);
        System.out.printf("%d\n", iVal1 - iVal2);
        System.out.printf("%d\n", iVal1 * iVal2);
        System.out.printf("%d\n", iVal1 / iVal2);
        System.out.printf("%d\n", iVal1 % iVal2);
        System.out.printf("%.2f\n", (float)(iVal1) / iVal2);
    }
}
//정수 2개(a, b)를 입력받아 합, 차, 곱, 몫, 나머지, 나눈 값을 자동으로 계산해보자.
//단 0 <= a, b <= 2147483647, b는 0이 아니다.
//첫 줄에 합, 둘째 줄에 차, 셋째 줄에 곱, 넷째 줄에 몫, 다섯째 줄에 나머지, 여섯째 줄에 나눈 값을 순서대로 출력한다.
//(실수, 소수점 이하 셋째 자리에서 반올림해 둘째 자리까지 출력) 10 3 -> 13 7 30 3 1 3.33