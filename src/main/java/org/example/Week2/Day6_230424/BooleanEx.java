package org.example.Week2.Day6_230424;

public class BooleanEx {
    public static void main(String[] args) {
        // boolean 선언, 값은 true와 false 두개.
        boolean flag1 = false;
        boolean flag2 = true;

        // boolean 값 출력하기
        boolean isBalanceSufficient = true; // 잔액이 충분한가?
        boolean isPaymentSuccess = false;   // 결제가 됐는가?

        System.out.println("잔액이 충분한가 : " + isBalanceSufficient);
        System.out.println("결제가 됐는가? : " + isPaymentSuccess);

        //boolean 결과 출력하기
        boolean result1 = 1 == 1;
        boolean result2 = 1 == 2;
        System.out.println(" 1 = 1인가? > " + result1);
        System.out.println(" 1 = 2인가? > " + result2);
    }
}
