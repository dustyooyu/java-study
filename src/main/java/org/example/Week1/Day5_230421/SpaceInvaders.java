package org.example.Week1.Day5_230421;

//SpaceInvaders - 지역변수로 사용하는 예제
public class SpaceInvaders {
    private void moveLeft(){
        int location = 0;
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }
    private void moveRight(){
        int location = 0;
        location = location + 1 ;
        System.out.printf("moveRight: %d\n", location);
    }
    public static void main(String[] args){
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
    }
}
