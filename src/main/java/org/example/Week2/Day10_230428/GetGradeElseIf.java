package org.example.Week2.Day10_230428;

public class GetGradeElseIf {
    public static void main(String[] args) {
        int score = 55;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}
// 조건식1, 2, 3, 그리고 모두 아닐 때 조건문 단 하나만 실행된다.