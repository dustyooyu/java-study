package org.example.Week2.Day10_230428;

public class SwitchCaseEx {
    public static void main(String[] args) {
        int dayOfWeek = 4; // 1: 월요일, 2: 화요일, ... , 7: 일요일
        switch (dayOfWeek) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println(dayOfWeek + "에 해당하는 요일은 없습니다.");
        }
    }
}
// break;문 쓰지 않으면 해당하는 조건문 이후 모든 문장을 실행한다.
