package ru.job4j.condition;

/**
 * Class Point
 * @author dvoeglazov
 * @since 10.01.2019
 */

public class Point {
    private int x;
    private int y;
    /**
     * Координаты точки
     * @param x координата по оси x
     * @param y координата по оси y
     */
    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Координаты точки
     * @param that входящая точка до которой считаем растояние
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);
        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }

}