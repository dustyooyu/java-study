package org.example.Week4.Day16_230509;

import java.util.Scanner;

public class PyramidRev {
    private String spaceChar = "0";

    // 생성자 -> 클래스 인스턴스 생성시 멤버변수 값 바꾸게 할 수 있음
    public PyramidRev(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    //한줄 만드는 메서드
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(2 * (h - i) - 1));
        // 공백문자는 멤버변수 값을 참조, "*"은 등차에 따라 감소, 공백 + * 연달아 출력 후 개행
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = 5;
        PyramidRev pyramidRev = new PyramidRev(" ");
        for (int i = 0; i < height; i++) {
            System.out.println(pyramidRev.makeALine(height, i));
        }
    }
}
