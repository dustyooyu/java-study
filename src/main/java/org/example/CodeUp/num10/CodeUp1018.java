package org.example.CodeUp.num10;
import java.util.Scanner;

public class CodeUp1018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        String[] timeArr = time.split(":");
        System.out.println(timeArr[0] + ":" + timeArr[1] );
    }
}

// 시간이 시:분으로 입력하면, ":"을 기준으로 값을 구분하여 시:분의 형식으로 출력하는 예제.