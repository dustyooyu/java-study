package org.example.Week2.Day9_230427;

public class BitEx {
    public static void main(String[] args) {
        String xor = String.format("%032d", Integer.parseInt(Integer.toBinaryString(3)));
        System.out.println(xor + " = 3");
        xor = String.format("%032d", Integer.parseInt(Integer.toBinaryString(5)));
        System.out.println(xor + " = 5");

        xor = String.format("%032d", Integer.parseInt(Integer.toBinaryString(3 ^ 5)));
        System.out.println(xor + " = 3 ^ 5 = " + (3 ^ 5));

        System.out.println(Integer.toBinaryString(~(3 ^ 5)) + " = ~(3 ^ 5) = " + ~(3 ^ 5));
        System.out.println(Integer.toBinaryString(-7) + " = -7");

        xor = String.format("%032d", Integer.parseInt(Integer.toBinaryString(3 & 5)));
        System.out.println(xor + " = 3 & 5 = " + (3 & 5));
        xor = Integer.toBinaryString(~(3 & 5));
        System.out.println(xor + " = ~(3 & 5) = " + ~((3 & 5)));
    }
}
