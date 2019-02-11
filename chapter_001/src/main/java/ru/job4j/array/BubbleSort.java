package ru.job4j.array;

/**
 * @author ivan Dvoeglazov (ivan.vanya.2012@inbox.ru)
 * @version 1
 * @since 11.02.2019
 */

public class BubbleSort {

    public int[] sort(int[] array) {
        int a;
        for (int b = 0; b < array.length - 1; b++) {
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    a = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = a;
                }

            }
        }
        return array;
    }
}



