package org.example.Week7.Day29;

public class Game369 {

    public static void main(String[] args) {
        int cnt = 3333;
//        System.out.println(game369(cnt));
        System.out.println(cnt + is369(cnt));
        game369Ex(cnt);
    }

    public static void game369Ex(int cnt){
        String result = is369(cnt);
        System.out.println(cnt+result);
    }
    public static String is369(int cnt) {
        int val = cnt / 10;
        int extra = cnt % 10;
        String str = (extra % 3 == 0 && extra != 0 ? "*" : "");
        if (val == 0)
            return str;

        return str + is369(val); // 재귀호출
    }
    public static String game369(int cnt) {
        String str = "";
        int num1 = cnt / 10;
        int num2 = cnt % 10;
        if (num1 % 3 == 0 && num1 != 0)
            str += "*";
        if (num2 % 3 == 0 && num2 != 0)
            str += "*";
        return str;
    } // 두자리수까지만 처리됨.
}



