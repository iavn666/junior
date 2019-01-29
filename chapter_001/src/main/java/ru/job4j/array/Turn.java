package ru.job4j.array;
/**
 * Class Turn
 * @author dvoeglazov
 * @since 29.01.2019
 */

public class Turn {
    public int[] back(int[] array) {
         for (int index = 0; index < array.length / 2; index++) {
             int a = array[index];
             array[index] = array[array.length - index - 1];
             array[array.length - index - 1] = a;
        }
        return array;
    }
}