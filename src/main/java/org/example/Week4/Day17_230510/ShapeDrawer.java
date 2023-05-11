package org.example.Week4.Day17_230510;

public abstract class ShapeDrawer {

    public abstract String makeALine(int h, int i);

    public void printShape(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.printf(makeALine(height, i));
        }
    }
}


