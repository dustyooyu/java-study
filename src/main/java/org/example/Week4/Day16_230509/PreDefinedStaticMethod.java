package org.example.Week4.Day16_230509;

public class PreDefinedStaticMethod {
    public static void main(String[] args) {
        Integer.parseInt("30");
        Math.pow(2, 10);
    }
}


// static 메서드 예.
// 두 메서드 널리 여러곳에서 사용하는 유틸리티 메서드.
// 생성자 없이 메서드를 호출하여 사용하고 있다.
// static 메서드를 main에서 바로 호출하기 위해서도 사용하고, 유틸리티 메서드를 만들 때도 사용함.