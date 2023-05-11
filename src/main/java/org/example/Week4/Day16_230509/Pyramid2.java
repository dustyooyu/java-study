package org.example.Week4.Day16_230509;

public class Pyramid2 {
    private String spaceChar = "0"; // 클래스의 멤버변수

    public Pyramid2(String spaceChar) {  // 생성자 - 멤버변수에 값을 바꿀 수 있다.
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) { // 프린트, 한줄 만들기, 반복하는 기능 3개
        for (int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1), "*".repeat(2 * i + 1));
        }
    }
    public static void main(String[] args) {
        Pyramid2 pyramid2 = new Pyramid2(" "); // 멤버변수에 " "를 넘겨 초기화한 인스턴스
        Pyramid2 pyramidSpaceZero = new Pyramid2("0"); // 멤버변수에 "0"을 넘겨 초기화한 인스턴스
        pyramid2.printPyramid(4); // " "이 출력되는 인스턴스의 메서드에 높이 4를 넘겨 출력
        System.out.println();
        pyramidSpaceZero.printPyramid(5); // "0"이 출력되는 인스턴스의 메서드에 높이 5를 넘겨 출력
    }
}

