package org.example.Week1.Day5_230421;

//SpaceInvaders - 지역변수로 사용하는 예제
public class SpaceInvadersMemberVariable { //
   int location; // class SpaceInvaders2의 멤버변수로 선언

    public void moveLeft(){ // moveLeftAndPrint로 명명하기 권장(위치 값주기, 출력)
        location = location - 1;
//        System.out.printf("moveLeft: %d\n", location);
            }
    public void moveRight(){
        location = location + 1 ;
//        System.out.printf("moveRight: %d\n", location);
    }

    public static void main(String[] args){
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        System.out.printf("직전위치: %d\n",simv.location);
        simv.moveRight();
        System.out.printf("최종위치: %d\n",simv.location);
    }
}
