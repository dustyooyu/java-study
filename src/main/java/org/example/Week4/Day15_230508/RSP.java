package org.example.Week4.Day15_230508;

import java.util.Scanner;

public class RSP {
    //CodeUp 1671 예제
    public String play(int user, int computor){
        // 0 = 바위, 1 = 가위, 2 = 보

        if(user == 0 && computor == 1) {
            return "win";
        } else if(user == 1 && computor == 2) {
            return "win";
        }else if(user == 2 && computor == 0){
            return "win";
        } else if(user == computor){
            return "tie";
        }else {
            return "lose";
        }
    }

    public static void main(String[] args) {
        RSP rsp = new RSP();
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int computer = sc.nextInt();
        System.out.println(rsp.play(user,computer));
    }
}
