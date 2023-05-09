package org.example.Week4.Day15_230508;

public class MutsaMath {
    // 약수의 합 리턴하는 메소드
    public int sumOfFactors(int num) { // int num을 매개변수로 받아 int 타입을 리턴
        int answer = 1; // 1은 당연히 약수이므로 우선 할당
        for (int i = 2; i <= num; i++) {
            if( num % i == 0) answer += i;
        }
        return answer; // 호출한 곳에 answer 값을 리턴함
    }

    void printResult (int num){
        System.out.printf("%d의 약수의 합은 %d입니다.\n", num, sumOfFactors(num));
    }
    // sumOfFactors에 num 매개변수 전달 후 answer 값 리턴하여 출력

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
        mutsaMath.printResult(12);
        mutsaMath.printResult(36);
        mutsaMath.printResult(48);
        mutsaMath.printResult(29);
    }
}

