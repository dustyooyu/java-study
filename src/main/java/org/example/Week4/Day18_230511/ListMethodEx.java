package org.example.Week4.Day18_230511;

import java.util.ArrayList;
import java.util.List;

public class ListMethodEx {
    public static void main(String[] args) {
        List l1 = new ArrayList();
        l1.add("hello");
        l1.add("0");
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println("size" + l1.size());
        System.out.println("비었는지" + l1.isEmpty());
        l1.remove(0);
        l1.remove(0); // 인덱스 0을 두번 지웠지만 초기화가 아니라 실제 삭제이므로 다음 값 인덱스가 됨.
        System.out.println(l1.isEmpty());
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.printf("%d %d %d\n", l1.get(0), l1.get(1), l1.get(2));
        l1.remove(2);
        System.out.printf("%d %d\n", l1.get(0), l1.get(1));
        System.out.println("---------------------");


        System.out.println("for each로 item에 접근하기");
        for (var item : l1){ // var를 통해 타입을 추론한다.
            System.out.println(item);
//            System.out.println(item().split); // 사용불가, 에러. String 외 타입들이 혼재해있어 접근 어려움
        }
    }
}
