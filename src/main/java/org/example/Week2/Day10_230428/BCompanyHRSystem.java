package org.example.Week2.Day10_230428;

import java.util.Scanner;

public class BCompanyHRSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearOfExp = sc.nextInt();
        int numOfProj = sc.nextInt();

        if (yearOfExp > 5 || numOfProj > 10) {
            System.out.println("팀장 승진 대상입니다.");
        } else {
            System.out.println("팀장 승진 대상이 아닙니다.");
        }
    }
}

/* B회사는 연차가 5년이 넘었거나 프로젝트 횟수가 10회를 넘으면 팀장으로 승진시키는 인사 정책을
가지고 있습니다. */
// 넘었거나 = 초과
