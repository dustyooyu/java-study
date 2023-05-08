package org.example.Week3.Day11_230501;

public class LoopChar {
    public static void main(String[] args) {
        // char a부터 z까지 증가시키며 출력
        for (char c = 'a'; c <= 'z'; c++){
            System.out.printf("%c ", c);
        }
        System.out.println();
        // ascii 코드 - 알파벳과 숫자2
        for (int c = 'A'; c < 'Z' ; c++) { // A = 65, Z =89, char 인트로 받으면 변화
            System.out.printf("%d ", c); // 정수로 출력
        }
        System.out.println();
        // ascii 코드 - 알파벳과 숫자2
        for (int c = 65; c < 'Z'; c++) { // 65~89
            System.out.printf("%d:%c ", c, c);  // 형식 정수, char형 지정
        }
        System.out.println();
        // 유니 코드 - 한글
        for (int c = '가'; c < '힣'; c++) { // 65~89
            System.out.printf("%d:%c ", c, c);  // 형식 정수, char형 지정
        }
        System.out.println();
    }
}
