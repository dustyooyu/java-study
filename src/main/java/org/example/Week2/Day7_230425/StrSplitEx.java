package org.example.Week2.Day7_230425;

import java.util.Arrays;

public class StrSplitEx {
    public static void main(String[] args) {

        //.split()으로 문자열 분리하기
        String str1 = "10 20 30 40";
        String[] strArr = str1.split(" "); // 공백을 기준으로 str의 문자열 분리
        System.out.println("str1 = " + str1);
        System.out.println("strArr[0] = " + strArr[0]);
        System.out.println("strArr[1] = " + strArr[1]);
        System.out.println("strArr[2] = " + strArr[2]);
        System.out.println("strArr[3] = " + strArr[3]);
        System.out.println();

        String str2 = "50,60,70,80";
        String[] strArr2 = str2.split(","); // 콤마를 기준으로 str의 문자열 분리
        System.out.println("str2 = " + str2);
        System.out.println("strArr2[0] = " + strArr2[0]);
        System.out.println("strArr2[1] = " + strArr2[1]);
        System.out.println("strArr2[2] = " + strArr2[2]);
        System.out.println("strArr2[3] = " + strArr2[3]);
    }
}
