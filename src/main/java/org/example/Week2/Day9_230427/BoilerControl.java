package org.example.Week2.Day9_230427;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45; // 물 온도
        int roomTemperature = 22; // 실내 온도

        boolean check = waterTemperature < 50 && roomTemperature < 24;
        System.out.printf("check: %b\n", check);
        }
    }
// 물온도 50도 미만, 실내온도 24도 미만