package org.example.Week1.Day5_230421;

public class UserTest {
    public static void main(String[] args) {
        User kyeongrok = new User();
        kyeongrok.name = "김경록";
        kyeongrok.phoneNumber = "010-0000-0000";
        kyeongrok.age = 37;

        User kima = new User();
        kima.name = "김에이";
        kima.phoneNumber = "010-0000-0000";
        kima.age = 20;
        
        User kims = new User();
        kims.name = "김스";
        kims.phoneNumber = "010-0000-0000";
        kims.age = 15;

        System.out.printf("%s님은 성인입니까? > %s\n",kyeongrok.name,kyeongrok.isAdult());
        System.out.printf("%s님은 성인입니까? > %s\n",kima.name,kima.isAdult());
        System.out.printf("%s님은 성인입니까? > %s\n",kims.name,kims.isAdult());
    }
}
