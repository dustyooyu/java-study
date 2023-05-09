package org.example.Week4.Day15_230508;

public class Account {
    int balance;

    public void printSufficient(){
        System.out.println("잔액이 충분합니다.");
    }

    public void printNotSufficient(){
        System.out.println("잔액이 부족합니다.");
    }

    public boolean isSufficient() { // 메소드 선언
        return balance >= 1500; // 변수 값이 1500 이상인지 판단 후 결과값 리턴
    }
}
