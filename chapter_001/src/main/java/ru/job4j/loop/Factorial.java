package ru.job4j.loop;

/**
 * Class Factorial
 * @author dvoeglazov
 * @since 17.01.2019
 */

public class Factorial {
    /**
     * Расчет фактариала
     * @param n значение фактариала
     * @return
     */
    public int calc(int n) {
        int c = 1;
        for (int a = 1; a <= n; a++) {
            if (a >= 1) {
                c = a * c;
            }

        }
        return c;

    }
}