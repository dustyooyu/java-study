package org.example.Week2.Day10_230428;

public class ElseExam {
    public static void main(String[] args) {
        boolean checkTrue = true;
        if (checkTrue) { // boolean 변수를 입력값으로 사용
            System.out.println("true 입니다."); // 값이 true임으로 실행됨
        } else {
            System.out.println("false 입니다.");
        }
        boolean checkfales = false;
        if (checkfales) { // boolean 변수를 입력값으로 사용.
            System.out.println("true 입니다."); // 값이 false임으로 실행되지 않음
        } else {
            System.out.println("false 입니다."); // true가 아닌 경우 실행됨
        }
    }
}