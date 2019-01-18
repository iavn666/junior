package ru.job4j.loop;
/**
 * Class Max
 * @author dvoeglazov
 * @since 17.01.2019
 */
public class Counter {

    /**
     * Сложение
     * @param start первый аргумент
     * @param finish второй аргумент
     * @return
     */

    public int add(int start, int finish) {
        int c = 0;
        for (int a = start; a <= finish; a++) {
            if (a % 2 == 0) {
               c = c + a;
            }
        }
        return c;

    }

}