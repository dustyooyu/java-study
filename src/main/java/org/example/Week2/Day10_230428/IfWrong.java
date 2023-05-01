package org.example.Week2.Day10_230428;

public class IfWrong {
    public static void main(String[] args) {
        // 90 이상 A, 80 이상 B, 70 이상 C를 작성하려고 할때 if문만 쓰는 예제
        int score = 81;
        if (score >= 90) {
            System.out.println("A");
        }
        if (score >= 80){
            System.out.println("B");
        }
        if (score >= 70){
            System.out.println("C");
        }
    }
}
// 위와 같이 작성시 80점은 80이상이며 동시에 70점 이상이며,
// if문이 실행되고 바로 다음 if문이 실행되므로 조건 맞는 점수 두개가 출력된다.
// GetGrade처럼 else - if 문으로 작성해 비교해보자.
