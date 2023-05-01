package org.example.Week2.Day10_230428;

import java.util.Scanner;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String time = "휴진";
        switch (day) {
            case "월", "화", "목", "금" : time = "09:30-18:30"; break;
            case "토" : time = "09:30-13:30"; break;
            case "수", "일" : time = "휴진"; break;
        }
        if ( time != "휴진") {
            System.out.printf("%s요일 진료시간은 %s입니다.\n", day, time);
        } else {
            System.out.printf("%s요일은 %s입니다.\n", day, time);
        }

    }
}
// case문과 break문을 한줄에 작성하여 가독성을 높일 수 있다.
