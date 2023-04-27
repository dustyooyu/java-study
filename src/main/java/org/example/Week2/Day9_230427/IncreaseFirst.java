package org.example.Week2.Day9_230427;

public class IncreaseFirst {
    public static void main(String[] args) {
        int idx = 0;
        int[] arr = {2, 1, 7, 4};
        System.out.println(arr[idx]);
        idx += 1;
        System.out.println(arr[idx]);
        idx += 1;
        System.out.println(arr[idx]);
        idx += 1;
        System.out.println(arr[idx]);
    }
}
// 배열의 인덱스를 1씩 증가시킬 때 복합대입연산자를 사용한 예제
// 인덱스 0부터 3까지 출력해본다.