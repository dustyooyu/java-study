package org.example.Week3.Day12_230502;

public class WhileEx {
    public static void main(String[] args) {

        int cnt = 0;
//        while (cnt < 11){
//            System.out.println(cnt); // cnt가 계속 11보다 작기 때문에 무한히 출력됨
//        }

        while (cnt < 11) {
            System.out.println(cnt);
            cnt++; // cnt 값이 1씩증가하고 10까지만 출력. 최종 cnt 값은 11
        }

        cnt = 0;
        while (cnt < 11) {
            System.out.println(cnt++); // cnt 출력 후 증가시킴. 최종 값은 11.
        }
        cnt = 0;
        while (cnt < 11) {
            System.out.printf("%d ", cnt++); // 한줄로 출력시키기
        }
    }
}
