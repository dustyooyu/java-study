package org.example.Week2.Day10_230428;

public class IfComparisonOperation {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >= 18;
        if (isAdult) { // boolean 변수를 if문의 입력값으로 상용
            System.out.println("성인입니다.");
        }
        if (age < 18){ // 조건식을 if문의 입력값으로 사용
            System.out.println("성인이 아닙니다.");
        }
    }
}
