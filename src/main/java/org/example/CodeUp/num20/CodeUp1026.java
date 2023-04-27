package org.example.CodeUp.num20;
import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] time = str.split(":");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2]);
        System.out.printf("%d", min);
    }
}
//시:분:초를 입력받아 분만 출력해보자.
//이 테스트에서 int hour, sec 선언 꼭 필요했을까?