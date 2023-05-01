package org.example.CodeUp.num10;
import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String[] dateArr = date.split("\\.");
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);
        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}

// 닷(.)로 구분하여 입력받은 연, 월, 일을 yyyy.mm.dd 형식으로 출력한다.
// 2013.8.5 -> 2013.08.05