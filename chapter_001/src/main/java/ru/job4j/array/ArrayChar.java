package ru.job4j.array;

/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 08.02.2019
 */

/**
 * Обертка над строкой.
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = false;
        char[] value = prefix.toCharArray();
        int min = Math.min(value.length, data.length);
        for (int i = 0; i < min; i++) {
            if (data[i] != value[i]) {
                return result;
            }
        }
        return true;


    }


}