package org.example.Week4.Day15_230508;

public class UserFactory {
    public User getAdultUser(){ // 리턴타입 - 참초타입 User
        User user = new User();
        user.age = 34;
        return user;
    }
}

// 리턴타입으로 참조타입을 갖는 메서드 작성.
// return 값으로 user를 반환한다.
