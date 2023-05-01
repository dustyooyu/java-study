package org.example.Week2.Day10_230428;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        String day = "수";
        String time = "휴진";
        switch (day) {
            case "월", "화", "목", "금" : time = "09:30-18:30"; break;
            case "토" : time = "09:30-13:30"; break;
            case "수", "일": time = "휴진"; break;
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}
// case문과 break문을 한줄에 작성하여 가독성을 높일 수 있다.
