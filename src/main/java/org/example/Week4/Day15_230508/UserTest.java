package org.example.Week4.Day15_230508;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User(); // User 클래스 인스턴스 생성
        user1.name = "김미미";
        user1.age = 14;

        User user2 = new User(); // User 클래스 인스턴스 생성
        user2.name = "김나나";
        user2.age = 37;

        System.out.printf("%s는 성인입니까? %s\n", user1.name, user1.isAdult());
        System.out.printf("%s는 성인입니까? %s\n", user2.name, user2.isAdult());
        // User 클래스의 boolean타입 메소드 isAdult 호출
    }
}
