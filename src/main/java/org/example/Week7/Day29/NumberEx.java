package org.example.Week7.Day29;

import java.util.ArrayList;
import java.util.List;

public class NumberEx {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(num + " 소수여부: " + isPrime(num));
        System.out.println(num + " 완전수여부: " + isPerpectionNumber(num));
        System.out.println(num + "의 약수: " + factors(num));
    }

    // 소수 판별
    public static boolean isPrime(int num) {
        int cnt = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) cnt++;
        }
        return (cnt == 1);
    }

    // 완전수 판별
    public static boolean isPerpectionNumber(int num) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                numbers.add(i);
        }
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        return (sum == num);
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


