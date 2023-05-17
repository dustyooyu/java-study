package org.example.Week5.Day22_230517;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack01 {
    int[] arr = new int[10]; // 스택
    int pointer = 0; // 데이터를 넣을 자리

    public boolean isEmpty() {
        return pointer == 0; // pointer가 0이면 빈 상태로 판단, true 반환.
    }

    public void push(int value) {
        this.arr[pointer++] = value;
        System.out.println(Arrays.toString(arr));
        System.out.println("pointer: " + pointer);
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[--pointer];
    }

    public int peek() {
        if (isEmpty()) throw new EmptyStackException();
        return arr[pointer-1];
    }

    public static void main(String[] args) {
        Stack01 stack01 = new Stack01();
        System.out.println("isEmpty? -> " + stack01.isEmpty());
        stack01.push(10);
        System.out.println("isEmpty? -> " + stack01.isEmpty());
        stack01.push(20);
        System.out.println("peak:" + stack01.peek());
        System.out.println("peak:" + stack01.peek());
        stack01.push(30);
        System.out.println("peak: " + stack01.peek());
        System.out.println("pop: " + stack01.pop());
        System.out.println("pop: " + stack01.pop());
        System.out.println("pop: " + stack01.pop());
        System.out.println("isEmpty? -> " + stack01.isEmpty());
        // 스택이 비워짐
//        stack01.pop(); // pointer가 -로 가면서 outofBounds 에러 발생!
//        System.out.println("peak:" + stack01.peek()); // 마찬가지로 outofBounds가  에러발생
// 에러처리 후 처리한 방식대로 에러 메시지 출력됨.
        stack01.push(10);
    }
}
