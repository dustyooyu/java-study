package org.example.Week2.Day7_230425;

import java.util.SplittableRandom;

public class StringEqualsEx {
    public static void main(String[] args) {

        // == 비교 연산자를 이용한 문자열 비교
        boolean isSame = "GOLD" == "GOLD";
        System.out.println("GOLD == GOLD ? > " + isSame );
        // GOLD 문자열 메모리 주소값을 비교함, true값

        // str1에서 분리한 문자열 G(.substring(0,1))와 str2의 비교
        String str1 = "GOLD";
        String str2 = "G";

        System.out.println("GOLD -> " + str1.hashCode());
        System.out.println("G -> " + str2.hashCode());

        // == 비교 연산자 이용
        System.out.println(str1.substring(0,1) == str2); // 둘다 G이지만 다른 주소를 가지므로 false
        // .equals 이용
        System.out.println(str1.substring(0,1).equals(str2)); // 문자열 객체의 문자열이 동일한지 비교, true 값
    }
}
        //