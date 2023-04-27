package org.example.CodeUp.num20;
import java.util.Arrays;
import java.util.Scanner;

// 보류
public class CodeUp1024n {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chArr = new char[scanner.nextLine().charAt(0)];
        System.out.println(Arrays.toString(chArr));
    }
}
// 입력받은 20자 이하 영단어 하나의 각 문자를 한줄에 한문자로 분리해 출력 - 배열이용
// ''로 묶어서 출력한다
// 입력 Boy -> 출력 'B' 'O' "Y'