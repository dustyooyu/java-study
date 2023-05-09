package org.example.Week4.Day15_230508;

public class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory(); // 인스턴스 생성
        User user = userFactory.getAdultUser(); // 메소드접근, 리턴값을 참조타입 User 변수 user에 할당
        System.out.println(user.age);
    }
}
