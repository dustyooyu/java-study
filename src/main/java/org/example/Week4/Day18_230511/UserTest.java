package org.example.Week4.Day18_230511;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User(); // User 클래스 인스턴스 생성
        user1.setName("김미미");
        user1.setAge(14);

        User user2 = new User(); // User 클래스 인스턴스 생성
        user2.setName("김나나");
        user2.setAge(37);

        System.out.printf("%s는 성인입니까? %s\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 성인입니까? %s\n", user2.getName(), user2.isAdult());
        // User 클래스의 boolean타입 메소드 isAdult 호출
    }
}