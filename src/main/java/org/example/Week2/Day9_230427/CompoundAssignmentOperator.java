package org.example.Week2.Day9_230427;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 10;

        x += 1; // x = x + 1;
        System.out.printf("+=1 %d\n", x);
        x -= 5;
        System.out.printf("-=5 %d\n", x);
        x *= 2;
        System.out.printf("*=2 %d\n", x);
        x /= 3;
        System.out.printf("/=3 %d\n", x);
        x %= 8; // x = x % 8
        System.out.printf("%%=8 %d\n", x);

    }
}
