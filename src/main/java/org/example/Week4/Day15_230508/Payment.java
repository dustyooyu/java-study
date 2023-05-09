package org.example.Week4.Day15_230508;

import java.util.Scanner;

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account(); // 인스턴스 생성

        account.balance = sc.nextInt(); // 인스턴스를 통해 클래스 멤버변수 값 할당
        System.out.printf("잔액 = %d\n",account.balance);

        boolean isSufficient = account.isSufficient(); // 인스턴스의 메서드 결과값을 변수에 할당
        if(isSufficient) {
            account.printSufficient();
        } else {
            account.printNotSufficient();
        }
    }
}
