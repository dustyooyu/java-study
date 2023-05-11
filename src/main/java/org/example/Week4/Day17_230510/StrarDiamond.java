package org.example.Week4.Day17_230510;

public class StrarDiamond {

    private static String getRepeatedSymbol(String symbol, int n) {
        return symbol.repeat(n);
    }

    public static void main(String[] args) {

        int height = 21;
        int pivot = height / 2;
        for (int i = 0; i < height; i++) {
            if (i <= pivot) { // 첫번째줄부터 가운데줄까지 * 증가
                System.out.printf("%s%s\n", getRepeatedSymbol("0", pivot - i), getRepeatedSymbol("*", 2 * i + 1));
            } else { // if (i > pivot)
                System.out.printf("%s%s\n", getRepeatedSymbol("0", i - pivot), getRepeatedSymbol("*", 2 * (height - i) - 1));
            }
        }
    }
}

