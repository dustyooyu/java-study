package org.example.Week2.Day8_230426;

public class ReferenceTypeArrayEx {
    public static void main(String[] args) {
        Student[] students = new Student[3]; // 배열 초기화
        students[0] = new Student(); // 클래스의 초기화
        students[0].name = "김경록";
        students[0].phoneNum = "010-1234-5678";
        students[0].age = 37;
        students[1].name = "마수리";
        students[1].phoneNum = "010-1111-2222";
        students[1].age = 25;
        students[2].name = "수리수";
        students[2].phoneNum = "010-2222-3333";
        students[2].age = 30;
    }
}
