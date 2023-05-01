package org.example.CodeUp.num110;

import java.util.Scanner;

public class CodeUp1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iNumX = sc.nextInt();
        int iNumY = sc.nextInt();

        System.out.printf("%.1f", (iNumX * iNumY) / 2.0);
    }
}

// 삼각형의 넓이를 구하는 프로그램을 작성한다. 정수로 입력된 (밑변 * 높이 / 2) , 소수 첫째자리까지 출력한다.
// float로 받는 거랑 차이가 있나 싶어서 해봤는데 메모리는 줄고 시간은 좀 늘고. 아직 모르겠다.