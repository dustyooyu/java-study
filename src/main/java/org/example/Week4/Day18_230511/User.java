package org.example.Week4.Day18_230511;

public class User {
    private String name;

    public User() {
    }

    private String phoneNumber;
    private int age;
    public User(String phoneNumber, int age) {
        this.phoneNumber = phoneNumber;
        this.age = age;
    }


// setter 생성
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

// getter 생성
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    // 생성자
    public User(String name, String phoneNumber, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    boolean isAdult() { return age >= 18; }
    // user가 성인인지 판별하기 위한 boolean 메소드 작성


}
