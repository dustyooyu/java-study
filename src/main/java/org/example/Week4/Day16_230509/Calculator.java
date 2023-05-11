package org.example.Week4.Day16_230509;

public class Calculator {
    public void plus() {
        System.out.println(1 + 1);
    }

    public void printPlusOne(int num) {
        System.out.println(num + 1);
    }

    public void printPlus(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public static void printMinus(int num1, int num2){ // static 메서드
        System.out.println(num1 - num2);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printPlus(10, 20);
        calculator.printPlus(20, 30);

        printMinus(10, 20);
        // static으로 생성된 메서드는 인스턴스생성 없이 사용 가능. 같은 클래스 내에 있기 때문에 클래스명도 필요 없음.

    }
}
