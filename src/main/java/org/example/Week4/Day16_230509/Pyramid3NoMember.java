package org.example.Week4.Day16_230509;

public class Pyramid3NoMember {
//    private String spaceChar = "0"; // 클래스의 멤버변수가 없다고 가정


    // 메서드 기능별 분리하기 - 메서드에서 멤버변수 참조하지 않을 때. 메서드 파라미터 값에 필요한 변수를 일일이 선언.

    // 1줄 만드는 기능
    public String makeALine(String spaceChar, int height, int i){ // 공백자, 높이, i 값 받음
        return String.format("%s%s\n", spaceChar.repeat(height - i -1), "*".repeat(2 * i + 1));
    }

    //반복인쇄하는 기능(한줄 만드는 메서드 활용)
    public void printPyramidWithSpaceChar(int height, String spaceChar) { // 높이, 공백자 값 받음
        for (int i = 0; i < height; i++) {
            System.out.printf(makeALine(spaceChar, height, i));
        }
    }
   // String spaceChar변수가 파라미터에 계속 있어야 하는 문제. -> 멤버변수 참조하게 리팩토링하기

    public static void main(String[] args) {
        Pyramid3NoMember pyramid3 = new Pyramid3NoMember(); // 클래스 인스턴스 생성
        pyramid3.printPyramidWithSpaceChar(4, "#");
        pyramid3.printPyramidWithSpaceChar(5, "&");
        // 메서드에 파라미터 값을 넘겨서 작동할 수 있게 함.

    }
}

