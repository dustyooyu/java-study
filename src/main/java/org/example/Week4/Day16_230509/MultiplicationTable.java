package org.example.Week4.Day16_230509;

public class MultiplicationTable {
    private String multipleSymbol;

    public MultiplicationTable(String multipleSymbol){
        this.multipleSymbol = multipleSymbol;
    }
        public void printDan(int dan) { // String multipleSymbol 파라미터로 넣는 대신 멤버변수 참조함
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d %s %d = %d\n", dan, multipleSymbol, i, dan * i);
        }
        System.out.println("-----------");
    }

    public static void main(String[] args) {
        // 특정단, 특정 곱하기 기호로 출력하기
//        printDan("*", 2); // printDan을 static으로 작성했을 경우, 인스턴스 생성없이 호출 가능
//        printDan("x",5);

        //멤버변수와 생성자로 접근하기
        MultiplicationTable mtX = new MultiplicationTable("x");
        mtX.printDan(2);
        mtX.printDan(3);
        MultiplicationTable mtStar = new MultiplicationTable("*");
        mtStar.printDan(4);

    }
}


//        for (int j = dan1; j <= dan2; j++) { // 단에 해당하는 부분은 인자로
//            for (int i = 1; i <= 9 ; i++) {

//                System.out.printf("%d * %d = %d\n",j, i, j * i);
//            }
//            System.out.println("----------");
//        }