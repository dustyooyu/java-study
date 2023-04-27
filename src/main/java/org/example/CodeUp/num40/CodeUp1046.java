package org.example.CodeUp.num40;
import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();
        int iVal3 = sc.nextInt();
        System.out.printf("%d\n", iVal1 + iVal2 + iVal3);
        System.out.printf("%.1f\n", (float)(iVal1 + iVal2 + iVal3) / 3);
    }
}
//정수 3개를 입력받아 합과 평균을 출력해보자. 단, -2147483648 ~ +2147483647
//정수 3개가 공백을 두고 입력된다.
//합과 평균을 줄을 바꿔 출력한다. 평균은 소수점 이하 둘째 자리에서 반올림해서 소수점 이하 첫째 자리까지 출력한다.
