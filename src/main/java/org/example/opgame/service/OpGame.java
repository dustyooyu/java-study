package org.example.opgame.service;

public class OpGame {
    int remainingAnswers;
    int a, b;
    String cheeringUpMsg = "한번 더 해보자";




    public void makeQuestion() {
        remainingAnswers = 3;
        a = 1;
        b = 1;
    }
    public void makeQuestion(int max) {
        int a = (int)(Math.random() * max);
        int b = (int)(Math.random() * (max - a)); // b는 a 이하로 만들어짐
    }

    public String getQuestion() {
        return String.format("%d + %d = ", a, b);
    }

    public int getRemainingAnswers() {
        return remainingAnswers;
    }

    public boolean isAnswer(int answer) {
        remainingAnswers--;
        return (a + b) == answer;
    }

    public String getCheeringUpMsg() {
        return cheeringUpMsg;
    }

}
