package ru.job4j.array;
/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 11.02.2019
 */

public class MatrixCheck {
    /**
     * Метод проверяет состоят ли диагонали массива из одних true или одних false
     *
     * @param data массив с элеменнтами true или false
     * @return результат проверки диагоналей true или false
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i][i] != data[i + 1][i + 1]) {
                result = false;
            }
        }
        for (int i = data.length - 1; i < 0; i--) {
            if (data[i][i] != data[i - 1][i - 1]) {
                result = false;
            }
        }
        return result;
    }
}