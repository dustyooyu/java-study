package org.example.Week4.Day16_230509;

public class Pyramid3Re {


    // 메서드 기능별 분리하고, 멤버변수 참조와 생성자 활용하여 멤버변수 값을 변화시켜 사용하기
    private String spaceChar = "0"; // 클래스의 멤버변수

    public Pyramid3Re(String spaceChar) {  // 생성자
        this.spaceChar = spaceChar;
    }

    // 1줄 만드는 기능
    public String makeALine(int height, int i){ // 공백자는 멤버변수 참조함
        return String.format("%s%s\n", spaceChar.repeat(height - i -1), "*".repeat(2 * i + 1));
    }

    //반복인쇄하는 기능에 한줄 만드는 메서드 활용
    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
    public static void main(String[] args) {
        Pyramid3Re pyramid = new Pyramid3Re("0"); // 공백자 0으로 넘긴 인스턴스 생성
        pyramid.printPyramidWithSpaceChar(4,"0");
        pyramid.printPyramidWithSpaceChar(5, "&");
        // printPyramidWithSpaceChar의 파라미터값으로 높이만 받고 참조시킬 수도 있지만, 출력할 때마다 인자를 받으려면 필요.

        // printPyramidWithSpaceChar 메서드 없이 작성
        System.out.println("-----------------------------");
        int h = 4;
        for (int i = 0; i < h; i++) {
            System.out.print(pyramid.makeALine(h,i));
            // makeALine의 파라미터 값으로 메인메서드에서 선언한 int h와 i 전달
            // print 메서드가 없으면 멤버변수인 공백자 값별로 인스턴스를 생성해야만 바뀐 값으로 접근할 수 있다.
        }
    }
}

