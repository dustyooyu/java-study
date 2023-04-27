package org.example.Week2.Day9_230427;

public class BitOperatorEx {
    public static void main(String[] args) {
        int val1 = 1; // 0001
        System.out.println(Integer.toBinaryString(val1));

        System.out.println(val1 << 1); // 1 * 2^1 -> 0010 -> 2
        System.out.println(val1 << 2); // 1 * 2^2 -> 0100 -> 4
        System.out.println(val1 << 3); // 1 * 2^3 -> 1000 -> 8

        int val2 = 32; // 100000
        System.out.println(Integer.toBinaryString(val2));
        System.out.println(val2 >> 1); // 32 / 2^1 -> 010000 -> 16
        System.out.println(val2 >> 2); // 32 / 2^2 -> 001000 -> 8
        System.out.println(val2 >> 3); // 32 / 2^3 -> 000100 -> 4
    }
}