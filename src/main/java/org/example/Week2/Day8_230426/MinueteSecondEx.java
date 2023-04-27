package org.example.Week2.Day8_230426;

public class MinueteSecondEx {
    public static void main(String[] args) {
        int seconds = 239;
        int minute = seconds / 60;
        int remainSeconds = seconds % 60;
        System.out.printf("%d초는 %d분 %d초이다.", seconds, minute, remainSeconds);
    }
}
