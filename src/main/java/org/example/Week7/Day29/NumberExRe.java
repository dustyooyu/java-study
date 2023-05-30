package org.example.Week7.Day29;

import java.util.ArrayList;
import java.util.List;

public class NumberExRe {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(num + " 소수여부: " + isPrime(num));
        System.out.println(num + " 완전수여부: " + isPerpectionNumber(num));
        System.out.println(num + "의 약수: " + factors(num));    }

    // 소수 판별
    public static boolean isPrime(int num) {
        int cnt = factorsOf(num).size();
        return (cnt == 1);
    }

    // 완전수 판별
    public static boolean isPerpectionNumber(int num) {
        List<Integer> numbers = factorsOf(num);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        return (sum == num);
//        return (num == numbers.stream().mapToInt(Integer::intValue).sum());
    }

    // 약수
    public static String factors(int num){
        return factorsOf(num).toString();
    }

    private static List<Integer> factorsOf(int num){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                numbers.add(i);
        }
        return numbers;
    }
}


