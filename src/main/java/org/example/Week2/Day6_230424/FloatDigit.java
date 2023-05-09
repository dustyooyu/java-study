package org.example.Week1.Day6_230424;

public class FloatDigit {
    public static void main(String[] args) {
        //float의 범위와 double 범위 경계 실습

        // 1.23e5 = 1.23 * 10^5 = 123,000
        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f; // 12,300,000,000
        double d10 = 1.23e10d; // 12,300,000,000 = 1.23 * 10^10

        System.out.println("f5 = " + f5);
        System.out.println("f6 = " + f6);
        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10); // 1023000003E10 값 출력. 오차 발생
        System.out.println("d10 = " + d10); // 1023000003E10 값 출력. 오차 발생
//      System.out.printf("f10: %f10\n", f10); // f10: 12300000256.00000010로 출력
        System.out.println();

        float fpie = 3.141592653589793f; // f접미사 없을시 possible lossy conversion from double to float 에러
        double dpie = 3.141592653589793;

        System.out.println("pie = 3.141592653589793");
        System.out.println("fpie = " + fpie);
        System.out.println("dpie = " + dpie);
    }
}
