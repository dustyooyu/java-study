package org.example.Week4.Day17_230510;

public class StarTriangleShapeDrawer extends ShapeDrawer {

    @Override
    // 피라미드를 출력할 클래스
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", " ".repeat(h - i), "*".repeat(2 * i - 1));
    }


    public static void main(String[] args) {
        ShapeDrawer triangleShapeDrawer = new StarTriangleShapeDrawer();
        int height = 7;
        triangleShapeDrawer.printShape(height);
    }
}
