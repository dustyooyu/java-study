package org.example.Week2.Day10_230428;

public class GetGradeIfElse {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 90) {
            System.out.println("A");
        } else {
            if (score >= 80) {
                System.out.println("B");
            } else {
                if (score >= 70) {
                    System.out.println("C");
                } else {
                    System.out.println("F");
                }
            }
        }
    }
}
// if