package org.example.Week7.Day29;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        printcheckLeapYear(year);
    }

    private static void printcheckLeapYear(int year) {
        if (checkLeapYear(year))
            System.out.println(year + " O");
        else
            System.out.println(year + " X");
    }

    public static boolean checkLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        if (year % 4 == 0) return true;
        else {
            return false;
        }
    }


}

