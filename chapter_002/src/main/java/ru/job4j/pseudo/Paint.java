package ru.job4j.pseudo;

/**
 * @author ivan
 * @version $Id$
 * @since 0.1
 */
public class Paint {


    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        System.out.println(triangle.draw());
        System.out.println();
        System.out.println(square.draw());
        Paint paint = new Paint();
        paint.draw(square);

    }

    public void draw(Shape shape) {
        System.out.println(shape.draw());
   }


}
