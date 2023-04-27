package org.example.CodeUp.num20;
import java.util.Arrays;
import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] date = str.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
//년월일(yyyy.mm.dd)를 입력받아,
//일월년(dd-mm-yyyy)로 출력해보자.
