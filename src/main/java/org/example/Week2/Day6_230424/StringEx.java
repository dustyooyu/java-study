package org.example.Week2.Day6_230424;

public class StringEx {
    public static void main(String[] args) {

        // 문자열과 숫자의 연산
//      int result = 1 + "1"; // int형에 "문자열" 저장할 수 없어 에러.
        int iResult = 1 + Integer.parseInt("1"); // 수동 형변환. 문자열 "1"을 숫자로 변환
        int iResult2 = Integer.parseInt(1 + "1"); // 연산결과인 문자열 "11"을 정수로 변환
        String sResult2 = 1 + "1"; // 자동형변환

        System.out.println("1 + \"1\" = " + 1 + "1");
        System.out.printf("int iResult = 1 + Integer.parseInt(\"1\") = %d\n", iResult);
        System.out.printf("int iResult2 = Integer.parseInt(1 + \"1\") = %d\n", iResult2);

        //소수점 문자열의 연산
        String strVal1 = "1.5";
        String strVal2 = "2.5";
        System.out.println("strVal1 + strVal2 = " + strVal1 + strVal2);
    }
}
