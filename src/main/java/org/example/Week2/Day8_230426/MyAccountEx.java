package org.example.Week2.Day8_230426;

public class MyAccountEx {
    public static void main(String[] args) {
        int myAccount = 1_000_000;
        System.out.printf("잔액: %d\n", myAccount);
        myAccount = myAccount - 500_000;
        System.out.printf("잔액: %d\n", myAccount);
        myAccount = myAccount + 4_000_000;
        System.out.printf("잔액: %d\n", myAccount);

        // 출력되는 값에 콤마 표현
        System.out.print(myAccount);
    }
}
