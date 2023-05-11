package org.example.Week4.Day16_230509;

import java.util.Arrays;

public class CodeUp1098ReOverLoad {

    private int[][] arr;
    private boolean printSeparator;
    // 멤버변수. 배열과 구분선.

    public CodeUp1098ReOverLoad() { // 파라미터 없을 시 기본값
        this.arr = new int[5][5];
        this.printSeparator = true;
    }

    public CodeUp1098ReOverLoad(boolean printSeparator) { // boolean 값 받을 경우
        this.arr = new int[5][5];
        this.printSeparator = printSeparator;
    }

    public CodeUp1098ReOverLoad(int rowCnt){ // 행만 전달받을 경우, 열은 기본값
        this.arr = new int[rowCnt][5];
    }

    public CodeUp1098ReOverLoad(int rowCnt, int colCnt){ // 행열 모두 전달받는 경우
        this.arr = new int[rowCnt][colCnt];
    }

    public void setBeam(int l, int direction, int x, int y) { // 네개의 파라미터 받는 메서드
        for (int i = 0; i < l; i++) {
            if(direction == 0){ // 가로
                arr[x - 1][y + i - 1] = 1;
            } else { // 세로
                arr[x + i - 1][y - 1] = 1;
            }
        }
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        if(this.printSeparator) System.out.println("-------------");
    }

    public static void main(String[] args) {
        CodeUp1098ReOverLoad c1098 = new CodeUp1098ReOverLoad(true);

        c1098.printArr();
        c1098.setBeam(2, 0, 1, 1);
        c1098.printArr();
        c1098.setBeam(3, 1, 2, 3);
        c1098.printArr();
        c1098.setBeam(4, 1, 2, 5);
        c1098.printArr();
    }
}