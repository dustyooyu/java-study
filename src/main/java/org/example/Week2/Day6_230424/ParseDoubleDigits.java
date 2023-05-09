package org.example.Week2.Day6_230424;

public class ParseDoubleDigits {
    public static void main(String[] args) {

        String val1 = "1.11111111"; // 소수점 여덟자리
        String val2 = "2.11111111"; // 소수점 여덟자리

        // 문자열 소수점 여덟자리 -> float형 변환
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result);

        // 문자열 소수점 여덟자리 -> double형 변환 : 소수점 15자리까지 반환
        double result2 = Double.parseDouble(val1) + Double.parseDouble(val2);
        System.out.println(result2);
    }
}
