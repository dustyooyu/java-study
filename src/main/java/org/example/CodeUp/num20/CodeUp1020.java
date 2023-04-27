package org.example.CodeUp.num20;

import java.util.Scanner;
public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String idNum = scanner.nextLine();
        String idDate = idNum.substring(0,6);
        String idInfo = idNum.substring(7); // 시작 인덱스만 입력하면 나머지 끝까지 범위 지정한다.
        System.out.println(idDate + idInfo);
    }
}
// 주민번호에서 "-" 제외하고 구분하여 출력하기