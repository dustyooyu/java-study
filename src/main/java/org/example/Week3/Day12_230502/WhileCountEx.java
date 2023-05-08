package org.example.Week3.Day12_230502;

public class WhileCountEx {
    public static void main(String[] args) {
        //countdownEx
        int cnt = 5;
        while (cnt > 0) {
            System.out.println(cnt--); // cnt++시 조건은 항상 참으로 무한루프
        }
    }
}
