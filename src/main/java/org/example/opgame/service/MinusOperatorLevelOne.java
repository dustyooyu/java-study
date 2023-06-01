package org.example.opgame.service;

public class MinusOperatorLevelOne implements IOperator {
    int a, b;

    @Override
    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void setB(int b) {
        this.b = b;
    }


    @Override
    public void generateQuestion(int max) {
        a = (int) (Math.random() * max);
//        b = (int)(Math.random() * max);
//        if (a < b) {
//            int tmp = a;
//            a = b;
//            b = tmp;
//        } // a < b 이면 자리를 바꾸기
        b = (int) (Math.random() * a);  // b를 a만큼만 만들기

    }

    @Override
    public String getQuestionMsg() {
        return String.format("%d - %d = ", a, b);
    }

    @Override
    public boolean isEqueals(int answer) {
        return (a - b) == answer;
    }
}
