package ru.job4j.loop;

/**
 * Class Board
 * @author dvoeglazov
 * @since 17.01.2019
 */

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int a = 1; a <= height; a++) {
            for (int b = 1; b <= width; b++) {

                if ((a + b) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }

            screen.append(ln);
        }
        return screen.toString();
    }
}