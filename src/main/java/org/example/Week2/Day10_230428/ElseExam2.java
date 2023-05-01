package org.example.Week2.Day10_230428;

public class ElseExam2 {
    public static void main(String[] args) {
        int account = 1400;
        if(account >= 1500) { // 비교식이 참일 때
            System.out.println("잔액을 차감합니다.");
        } else { // 비교식이 거짓일 때 실행
            System.out.println("잔액이 부족합니다.");
        }
    }
}