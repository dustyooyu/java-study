package org.example.Week2.Day7_230425;

public class StringFormatEx {
    public static void main(String[] args) {
String menu = "딸기주스";
int price = 5800;
String menuChoice = String.format("선택하신 메뉴는 %s 입니다. 가격은 %d원 입니다.", menu, price);
System.out.println(menuChoice);
    }
}
