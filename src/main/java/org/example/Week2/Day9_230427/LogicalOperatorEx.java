package org.example.Week2.Day9_230427;

public class LogicalOperatorEx {
    public static void main(String[] args) {

        // && 연산자 실습
        int age = 25;
        boolean isStudent = false;
        System.out.printf("age = %d, 학생여부 = %b \n", age, isStudent);

        if (age >= 18 && !isStudent) {
            System.out.println("성인이며 학생이 아닙니다.");
        }

        boolean result = true && true;
        System.out.printf("%b\n", result);
        result = true && false;
        System.out.printf("%b\n", result);
        result = false && true;
        System.out.printf("%b\n", result);
        result = false && false;
        System.out.printf("%b\n", result);
        System.out.println("-----------");

        //OR 연산자 실습
        result = true || true;
        System.out.printf("%b\n", result);
        result = true || false;
        System.out.printf("%b\n", result);
        result = false || true;
        System.out.printf("%b\n", result);
        result = false || false;
        System.out.printf("%b\n", result);
        System.out.println("-----------");

        int yearOfExp = 8;
        int numOfProjact = 12;
        boolean isPromototin = yearOfExp > 5 || numOfProjact > 10;
        System.out.printf("승진대상자입니까? %b\n", isPromototin);

        System.out.println("-----------");

        // NOT 연산자 실습
        result = true;
        System.out.println(!result);
        result = false;
        System.out.println(!result);
        System.out.println("-----------");

        int userAge = 31;
        boolean isAdult = userAge >= 18;
        System.out.printf("미성년자입니까? -> %b \n", isAdult);

    }
}
