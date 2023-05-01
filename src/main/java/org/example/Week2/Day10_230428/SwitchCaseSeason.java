package org.example.Week2.Day10_230428;

import java.util.Scanner;

public class SwitchCaseSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 12 :       // 값별로 하나씩 작성할 수도 있지만,
                System.out.println("겨울");
                break;
            case 1, 2 :   // 이렇게 값별로 묶어서 실행할 수도 있다. 훨씬 간결.
                System.out.println("겨울");
                break;
            case 3, 4, 5 :
                System.out.println("봄");
                break;
            case 6, 7, 8 :
                System.out.println("여름");
                break;
            case 9, 10, 11 :
                System.out.println("가을");
                break;
            default:
                System.out.println("해당하는 계절이 없습니다.");
        }
    }
}
